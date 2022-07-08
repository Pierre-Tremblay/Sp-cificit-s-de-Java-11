package fr.diginamic.cinéphile.bo;

public class Projecteur extends Button{
    private String entree;
    private LecteurDvd lecteurDdd;

    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    @Override
    public void marche() {
        System.out.println("Le projecteur marche");
    }

    @Override
    public void arret() {
        System.out.println("Le projecteur s'arrête");
    }

    public void modeTV() {
        System.out.println("Le projecteur mode TV activé");
    }

    public void modeGrandEcran() {
        System.out.println("Le projecteur mode grand écran activé");
    }
}
