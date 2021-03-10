package Prototype;

public class PrototypeTest {
    public static void main(String[] args)  throws CloneNotSupportedException {
        XiaomiSmartWatch xiaomiMiBand3 = new XiaomiSmartWatch(Brand.Xiaomi,"MiBand",20.5f,
                3,true);

        XiaomiSmartWatch xiaomiMiBand5 = (XiaomiSmartWatch) xiaomiMiBand3.copy();
        xiaomiMiBand5.setVersion(5);
        xiaomiMiBand5.setPriceEuro(25.0f);
        xiaomiMiBand5.isWatherProof(false);

        AppleSmartWach appleSmartWach1 = new AppleSmartWach(Brand.Apple,"Watch Series5",
                42.67f,true);

        AppleSmartWach appleSmartWach2 =(AppleSmartWach) appleSmartWach1.copy();
        appleSmartWach2.setModel("Watch Series3");
        appleSmartWach2.setPriceEuro(200.4f);

        System.out.println(appleSmartWach1);
        System.out.println(appleSmartWach2);

        System.out.println("-------------------------------------------");

        System.out.println(xiaomiMiBand3);
        System.out.println(xiaomiMiBand5);





    }
}
