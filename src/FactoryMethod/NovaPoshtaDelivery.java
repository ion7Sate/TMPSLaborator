package FactoryMethod;

public class NovaPoshtaDelivery implements Order {

    private final TypeDelivery typeDelivery;
    private float discount;
    private static final  float pricePerKM = 11.67f;

    public NovaPoshtaDelivery(TypeDelivery typeDelivery) {

        this.typeDelivery = typeDelivery;
    }

    public void deliveryOrder(){
        System.out.println("The order is delivered by "+typeDelivery);
    }

    public float  calculateTotalPrice(float distance){

        float totalPrice  = (pricePerKM * distance) - discount;
        System.out.println("Price for delivery this order is "+totalPrice);
        return totalPrice;
    }

}
