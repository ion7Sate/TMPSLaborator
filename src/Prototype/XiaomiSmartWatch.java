package Prototype;

public class XiaomiSmartWatch extends SmartWatch{
    private int version;
    static String OS ="Android";
    private boolean watherProof;

    public XiaomiSmartWatch(Brand brand, String model, float priceEuro, int version, boolean watherProof) {
        super(brand, model, priceEuro);
        this.version = version;
        this.watherProof = watherProof;
    }

    public void setWatherProof(boolean watherProof){
        this.watherProof = watherProof;
    }
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isWatherProof() {
        return watherProof;
    }


    public static String getOS() {
        return OS;
    }

    public static void setOS(String OS) {
        XiaomiSmartWatch.OS = OS;
    }

    public boolean isWatherProof(boolean b) {
        setWatherProof(b);
        return isWatherProof();
    }


    public SmartWatch copy() throws  CloneNotSupportedException{
        return (SmartWatch) super.clone();
    }

    @Override
    public String toString() {
        return "XiaomiSmartWatch{" +
                "brand=" + getBrand()+
                ", model='" + getModel() + '\'' +
                ", version ="+version+
                ", priceEuro=" + getPriceEuro() +
                ",Operating System="+OS+
                ", watherProof=" + watherProof +
                '}';
    }
}
