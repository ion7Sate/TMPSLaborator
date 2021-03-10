package AbstractFactory;

public class MICB implements Bank {

    private final String BankName;

    public MICB(){
        BankName = "Moldindconbank";
    }

    public  String getBankCompletName(){
        return BankName;
    }
}
