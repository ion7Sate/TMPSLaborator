package Singleton;

public final class Rector {
    private static Rector rectorInstance;
    private int id;
    private String fullNameOfRector;
    private String dateOfBirth;
    private String email;

    private Rector(int id,String fullNameOfRector,String dateOfBirth,String email) {
        this.id = id;
        this.fullNameOfRector = fullNameOfRector;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public static Rector getInstance(int id,String fullNameOfRector,String dateOfBirth,String email) {
        if (rectorInstance == null) {
            rectorInstance = new Rector(id,fullNameOfRector,dateOfBirth,email);
        }
        return rectorInstance;
    }

    public static Rector getRectorInstance() {
        return rectorInstance;
    }

    public static void setRectorInstance(Rector rectorInstance) {
        Rector.rectorInstance = rectorInstance;
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
        return "Rector{" +
                "id=" + id +
                ", fullNameOfRector='" + fullNameOfRector + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
