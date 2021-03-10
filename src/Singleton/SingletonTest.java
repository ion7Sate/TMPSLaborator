package Singleton;

public class SingletonTest {
    public static void main(String[] args) {

        Rector rector = Rector.getInstance(1,"Viorel Bostan","31-08-1972",
                "viorel.bostan@adm.utm.md");
        Rector exRector = Rector.getInstance(2,"Ion Bostan","31-07-1949",
                "ionbostan1@gmail.com");
        if(rector.getFullNameOfRector() == exRector.getFullNameOfRector()){
            System.out.println("Test is passed.The use of the singleton was successful!");
        } else{
            System.out.println("Something went wrong");
        }
        System.out.println(rector);
        System.out.println(exRector);

        System.out.println("-----------------------------------------------------");
        //----------------------------------------------------------------------------------------//

        RectorEnum actualRector =RectorEnum.rector_Instance.getInstance();

        RectorEnum anotherRector = RectorEnum.rector_Instance.getInstance();
        anotherRector.setFullNameOfRector("Sapteste Ion");


        System.out.println(actualRector);
        System.out.println(anotherRector);


        System.out.println("-------------------------------------------------------------------------");

        RectorSyncronized rectorSyncronized2 = RectorSyncronized.getInstance(3,"Ion Bostan",
                "31-07-1949","ionbostan1@gmail.com");

        System.out.println(rectorSyncronized2);
    }
}
