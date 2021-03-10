package Singleton;

public enum RectorEnum {
    rector_Instance(1,"Viorel Bostan","31-08-1972","viorel.bostan@adm.utm.md");
    private int id;
    private String fullNameOfRector;
    private String dateOfBirth;
    private String email;


    private RectorEnum(int id, String fullNameOfRector, String dateOfBirth, String email) {
        this.id = id;
        this.fullNameOfRector = fullNameOfRector;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public RectorEnum getInstance(){
        return rector_Instance;
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
        return "RectorEnum{" +
                "id=" + id +
                ", fullNameOfRector='" + fullNameOfRector + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
