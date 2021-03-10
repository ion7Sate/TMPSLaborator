package Prototype;

public class AppleSmartWach extends SmartWatch{
    static String OS ="iOS";
    private boolean simCard;

    public AppleSmartWach(Brand brand, String model, float priceEuro, boolean simCard) {
        super(brand, model, priceEuro);
        this.simCard = simCard;
    }

    public static String getOS() {
        return OS;
    }

    public static void setOS(String OS) {
        AppleSmartWach.OS = OS;
    }

    public boolean isWithSimCard() {
        return simCard;
    }

    public boolean isWithSimCard(boolean s){
        setSimCard(s);
        return isWithSimCard();
    }

    public void setSimCard(boolean simCard) {
        this.simCard = simCard;
    }

    public SmartWatch copy() throws  CloneNotSupportedException{
        return (SmartWatch) super.clone();
    }

    @Override
    public String toString() {
        return "AppleSmartWach{" +
                "brand=" + getBrand()+
                ", model='" + getModel() + '\'' +
                ", priceEuro=" + getPriceEuro() +
                ", Operating System="+OS+
                ", simCard=" + simCard +
                '}';
    }
}
