package fr.diginamic.cinéphile.bo;

public class LecteurCd extends Button {
    public void jouer() {
        System.out.println("Le lecteur cd lit un cd");
    }

    public void stop() {
        System.out.println("Le lecteur s'arrête'");
    }

    public void ejecter() {
        System.out.println("Le lecteur cd sort le CD");
    }

    public void pause() {
        System.out.println("Le lecteur cd  met en pause le CD");
    }


    @Override
    public void marche() {
        System.out.println("Le lecteur cd marche");
    }

    @Override
    public void arret() {
        System.out.println("Le lecteur cd est arrêté");
    }
}
