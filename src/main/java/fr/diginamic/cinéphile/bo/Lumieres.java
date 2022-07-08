package fr.diginamic.cinéphile.bo;

public class Lumieres extends Button{
    @Override
    public void marche() {
        System.out.println("La lumière  marche");
    }

    @Override
    public void arret() {
        System.out.println("La lumière s'éteint");
    }

    public void attenuer(int valeur) {
        System.out.println("La lumière est atténuée de " + valeur +"%");
    }
}
