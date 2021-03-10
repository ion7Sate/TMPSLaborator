package FactoryMethod;

public class DhlDelivery implements Order{

  private  final TypeDelivery typeDelivery;

  private  final float pricePerKM = 12.3f;

    public DhlDelivery(TypeDelivery typeDelivery) {

        this.typeDelivery = typeDelivery;
    }

    @Override
    public void deliveryOrder() {
        System.out.println("The order is delivered by "+typeDelivery);
    }

   public float calculateTotalPrice(float distance){
        float totalPrice  = pricePerKM * distance;
       System.out.println("Price for delivery this order is "+totalPrice);

       return totalPrice;
   }
}
