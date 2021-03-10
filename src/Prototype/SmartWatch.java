package Prototype;

public abstract class SmartWatch implements Cloneable {
    private Brand brand;
    private String model;
    private float priceEuro;


    public SmartWatch(Brand brand, String model, float priceEuro) {
        this.brand = brand;
        this.model = model;
        this.priceEuro = priceEuro;
    }

    public Brand getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPriceEuro() {
        return priceEuro;
    }

    public void setPriceEuro(float priceEuro) {
        this.priceEuro = priceEuro;
    }

    public abstract SmartWatch copy() throws CloneNotSupportedException;

}


