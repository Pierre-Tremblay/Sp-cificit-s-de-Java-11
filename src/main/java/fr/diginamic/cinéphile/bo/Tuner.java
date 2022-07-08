package fr.diginamic.cinéphile.bo;

public class Tuner extends Button {
    private boolean am;
    private boolean fm;
    private int frequence;

    public int getFrequence() {
        return frequence;
    }

    public void setFrequence(int frequence) {
        this.frequence = frequence;
    }

    public boolean isAm() {
        return am;
    }

    public void setAm(boolean am) {
        this.am = am;
    }

    public boolean isFm() {
        return fm;
    }

    public void setFm(boolean fm) {
        this.fm = fm;
    }

    @Override
    public void marche() {
        System.out.println("Le tuner  marche");
    }

    @Override
    public void arret() {
        System.out.println("Le tuner est à l'arrêt");
    }
}
