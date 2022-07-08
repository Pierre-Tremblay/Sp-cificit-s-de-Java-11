package fr.diginamic.manufactory.factory;

import fr.diginamic.manufactory.bo.Smartphone;
import fr.diginamic.manufactory.bo.SpeakerConnected;
import fr.diginamic.manufactory.bo.Tablet;
import fr.diginamic.manufactory.category.ObjectConnected;
import fr.diginamic.manufactory.typeOfObjects.TypeOfObjects;

public class ObjectConnectedFactory {
    public static ObjectConnected getObjectConnected(Enum<TypeOfObjects> type) {
        if(type.equals(TypeOfObjects.SMARTPHONE)) {
            return new Smartphone(5);
        } else if (type.equals(TypeOfObjects.TABLET)) {
            return new Tablet(5);
        } else if (type.equals(TypeOfObjects.SPEAKER_CONNECTED)) {
            return new SpeakerConnected(12);
        }
        return null;
    }
}
