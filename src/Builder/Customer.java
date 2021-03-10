package Builder;

public final class Customer {
    private   final int id;
    private   final String fullName;
    private   final String email;
    private   final String country;
    private   final Status status;
    private   final String  promoCode;

    private Customer(CustomerBuilder customerBuilder){
        this.id = customerBuilder.id;
        this.fullName = customerBuilder.fullName;
        this.email = customerBuilder.email;
        this.country = customerBuilder.country;
        this.status = customerBuilder.status;
        this.promoCode = customerBuilder.promoCode;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public Status getStatus() {
        return status;
    }

    public String  getCupons() {
        return promoCode;
    }
    public static class CustomerBuilder {
        private int id;
        private final String fullName;
        private String email;
        private String country;
        private Status status;
        private  String  promoCode;

        public CustomerBuilder(String fullName) {
            if (fullName == null) {
                throw new IllegalArgumentException("The Customer must have name");
            }
            this.fullName = fullName;
        }
       public CustomerBuilder withId(int id){
            this.id = id;
            return this;
       }
        public CustomerBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public CustomerBuilder withCountry(String country){
            this.country = country;
            return this;
        }

        public CustomerBuilder withStatus(Status status){
            this.status = status;
            return this;
        }
        public CustomerBuilder withPromoCode(String promoCode){
            this.promoCode = promoCode;
            return this;
        }

        public  Customer build(){
            return new Customer(this);
        }

    }
}
