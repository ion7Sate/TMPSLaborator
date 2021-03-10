package AbstractFactory;

public  class BankFactory extends AbstractFactory{

    public Bank getBank(String bank){

        if(bank == null){
            throw new IllegalArgumentException("Bank  can't be null ");
        }
        if(bank.equals("MAIB")){
            return new MAIB();
        }
        if(bank.equals("MICB")){
            return new MICB();
        }
        if(bank.equals("VictoriaBank")){
            return new VictoriaBank();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}
