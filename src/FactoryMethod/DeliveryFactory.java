package FactoryMethod;

public class DeliveryFactory {

    public static Order setTypeOfDelivery(TypeDelivery typeDelivery){

        if (typeDelivery == null){
            throw new IllegalArgumentException("Type deliver can't be null ");
        }
             else if (TypeDelivery.DHL.equals(typeDelivery)) {
                return new DhlDelivery(TypeDelivery.DHL);
            } else if (TypeDelivery.NovaPoshta.equals(typeDelivery)) {
                return new NovaPoshtaDelivery(TypeDelivery.NovaPoshta);
            } else if (TypeDelivery.PostaMoldovei.equals(typeDelivery)) {
                return new PostaMoldoveiDelivery(TypeDelivery.PostaMoldovei);
            }



        return null;
    }

}
