package fr.diginamic.cinéphile.bo;

public class Main {
    public static void main(String[] args) {
        FacadeHomeCinema facadeHomeCinema = new FacadeHomeCinema();
        System.out.println("/////// UTILISATION DU LECTEUR CD ///////");
        facadeHomeCinema.ecouterCD();
        System.out.println("/////// ETEINDRE LES LUMIERES ///////");
        facadeHomeCinema.lumiere.arret();
        System.out.println("/////// ECLATER LES POP-CORN ///////");
        facadeHomeCinema.machineAPopcorn.eclater();
        System.out.println("/////// REGARDER UN FILM ///////");
        facadeHomeCinema.regarderFilm();
    }
}

