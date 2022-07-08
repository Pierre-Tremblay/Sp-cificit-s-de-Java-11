package fr.diginamic.cinéphile.bo;

public class Main {
    public static void main(String[] args) {
        FacadeHomeCinema facadeHomeCinema = new FacadeHomeCinema();
        facadeHomeCinema.regarderFilm();
        facadeHomeCinema.arreterFilm();
        facadeHomeCinema.ecouterCD();
        facadeHomeCinema.arreterCD();
        facadeHomeCinema.ecouterRadio();
        facadeHomeCinema.arreterRadio();
    }
}

