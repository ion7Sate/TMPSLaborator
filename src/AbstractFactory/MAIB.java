package AbstractFactory;

public class MAIB  implements Bank{

    private final String BankName;

    public MAIB(){
        BankName = "Moldova-Agroindbank";
    }

    public  String getBankCompletName(){
        return BankName;
    }
}
