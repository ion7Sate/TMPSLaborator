package FactoryMethod;

public class PostaMoldoveiDelivery implements Order{

    private  final TypeDelivery typeDelivery;

    private  final float pricePerKM = 2.2f;
    private final float StateCost = 12;

    public PostaMoldoveiDelivery(TypeDelivery typeDelivery) {

        this.typeDelivery = typeDelivery;

    }

    @Override
    public void deliveryOrder() {
        System.out.println("The order is delivered by "+typeDelivery);
    }

    public float calculateTotalPrice(float distance){
        float totalPrice = pricePerKM*distance * distance + StateCost;
        System.out.println("Price for delivery this order is "+totalPrice);
        return totalPrice;
    }
}
