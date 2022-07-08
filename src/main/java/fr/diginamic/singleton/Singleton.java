package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Singleton {
    private static Singleton instance;
    private ResourceBundle value;

    public Singleton(ResourceBundle value) {
        this.value = value;
    }

    public static Singleton getInstance(ResourceBundle  value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public ResourceBundle getValue() {
        return value;
    }
}