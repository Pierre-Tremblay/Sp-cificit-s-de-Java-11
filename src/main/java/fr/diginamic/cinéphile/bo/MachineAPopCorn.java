package fr.diginamic.cinéphile.bo;

public class MachineAPopCorn extends Button{
    @Override
    public void marche() {
        System.out.println("La machine a popcorn  marche");
    }

    @Override
    public void arret() {
        System.out.println("La machine a popcorn s'arrête");
    }

    public void eclater() {
        System.out.println("Les popcorns éclatent");
    }
}
