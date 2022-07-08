package fr.diginamic.manufactory2.button;

public class ButtonTablet implements Button {
    private boolean state;

    public ButtonTablet() {
        state = false;
    }

    public void toggle() {
        state = !state;
        System.out.println((state) ? "Bouton tablette activé" : "Bouton tablette désactivé");
    }
}
