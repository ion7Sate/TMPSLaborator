package FactoryMethod;

public class DeliveryService {

    public static void main(String[] args) {
        DeliveryFactory  newOrder =   new DeliveryFactory();

        Order order = DeliveryFactory.setTypeOfDelivery(TypeDelivery.PostaMoldovei);
        order.deliveryOrder();
        order.calculateTotalPrice(7.4f);

        System.out.println("------------------------------------------");

        Order order1 = DeliveryFactory.setTypeOfDelivery(TypeDelivery.DHL);
        order1.deliveryOrder();
        order1.calculateTotalPrice(7.4f);

        System.out.println("----------------------------------------");

        Order order2= DeliveryFactory.setTypeOfDelivery(TypeDelivery.NovaPoshta);
        order2.deliveryOrder();
        order2.calculateTotalPrice(7.4f);


    }
}
