package Singleton;

public class RectorSyncronized {
    private static volatile RectorSyncronized instance;
    private int id;
    private String fullNameOfRector;
    private String dateOfBirth;
    private String email;
    private static Object mutex = new Object();

    private RectorSyncronized(int id,String fullNameOfRector,String dateOfBirth,String email) {
        this.id  = id;
        this.fullNameOfRector = fullNameOfRector;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public static RectorSyncronized getInstance(int id,String fullNameOfRector,String dateOfBirth,String email) {
        RectorSyncronized result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null)
                    instance = result = new RectorSyncronized(1223,"Viorel Bostan",
                            "31-08-1972","viorelbostan1@gmail.com");
            }
        }
        return result;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullNameOfRector() {
        return fullNameOfRector;
    }

    public void setFullNameOfRector(String fullNameOfRector) {
        this.fullNameOfRector = fullNameOfRector;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "RectorSyncronized{" +
                "id=" + id +
                ", fullNameOfRector='" + fullNameOfRector + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
