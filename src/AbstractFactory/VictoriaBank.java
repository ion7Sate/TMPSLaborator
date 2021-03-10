package AbstractFactory;

public class VictoriaBank implements Bank{
    private final String BankName;

    public VictoriaBank(){
        BankName = "VictoriaBank ";
    }

    public  String getBankCompletName(){
        return BankName;
    }
}
