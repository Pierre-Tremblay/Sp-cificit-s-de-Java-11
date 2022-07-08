package fr.diginamic.manufactory2.button;

public class ButtonSmartphone implements Button {
    private boolean state;

    public ButtonSmartphone() {
        state = false;
    }

    public void toggle() {
        state = !state;
        System.out.println((state) ? "Bouton portable activé" : "Bouton portable désactivé");
    }
}
