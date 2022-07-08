package fr.diginamic.manufactory2.button;

public class ButtonSpeaker implements Button {
    private boolean state;

    public ButtonSpeaker() {
        state = false;
    }

    public void toggle() {
        state = !state;
        System.out.println((state) ? "Bouton enceinte activé" : "Bouton enceinte désactivé");
    }
}
