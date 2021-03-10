package Builder;

public enum Status {
    AcitveCustumer,
    NewCustomer,
    PasivCustomer;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
