package fr.diginamic.manufactory;

import fr.diginamic.manufactory.category.ObjectConnected;
import fr.diginamic.manufactory.factory.ObjectConnectedFactory;
import fr.diginamic.manufactory.typeOfObjects.TypeOfObjects;

public class Main {
    public static void main(String[] args) {

        ObjectConnected objectSmarphone = ObjectConnectedFactory.getObjectConnected(TypeOfObjects.SMARTPHONE);
        ObjectConnected objTablet = ObjectConnectedFactory.getObjectConnected(TypeOfObjects.TABLET);
        ObjectConnected objectSpeaker = ObjectConnectedFactory.getObjectConnected(TypeOfObjects.SPEAKER_CONNECTED);
        ObjectConnected objSmartwatch = ObjectConnectedFactory.getObjectConnected(TypeOfObjects.SMARTWATCH);

        System.out.println(objectSmarphone.getClass()); // class fr.diginamic.manufactory.bo.Smartphone
        System.out.println(objTablet.getClass()); //class fr.diginamic.manufactory.bo.Tablet
        System.out.println(objectSpeaker.getClass()); //class fr.diginamic.manufactory.bo.SpeakerConnected
        System.out.println(objSmartwatch); //null

    }
}
