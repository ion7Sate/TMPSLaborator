package Builder;

public class BuilderTest {
    public static void main(String[] args) {

        Customer ion7sate = new Customer.CustomerBuilder("Saptesate Ion")
                .withId(1234)
                .withEmail("ion.saptesate@ee.utm.md")
                .withCountry("Republic of Moldova")
                .withPromoCode("qwe3rty10%")
                .build();


        Customer davidCopherfild = new Customer.CustomerBuilder("David Copherfild")
                .withId(14)
                .withCountry("Republic of South Corea")
                .withPromoCode("tndnile45%")
                .build();

        Customer anaTurturica = new Customer.CustomerBuilder("Ana Turtutrica")
                .withId(567)
                .withCountry("Czech Republic")
                .withEmail("anaturtur@czech.cz")
                .withStatus(Status.NewCustomer)
                .build();


        System.out.println();





    }
}
