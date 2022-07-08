package fr.diginamic.cinéphile.bo;

public class LecteurDvd extends Button{
    private boolean audioSurrond;
    private boolean audioStereo;
    @Override
    public void marche() {
        System.out.println("Le lecteur dvd  marche");
    }

    @Override
    public void arret() {
        System.out.println("Le lecteur dvd s'arrête");
    }

    public boolean isAudioSurrond() {
        return audioSurrond;
    }

    public void setAudioSurrond(boolean audioSurrond) {
        this.audioSurrond = audioSurrond;
    }

    public boolean isAudioStereo() {
        return audioStereo;
    }

    public void setAudioStereo(boolean audioStereo) {
        this.audioStereo = audioStereo;
    }
    public void ejecter() {
        System.out.println("Le lecteur DVD éjecte le DVD");
    }

    public void pause() {
        System.out.println("Le lecteur DVD met en pause le DVD");
    }

    public void jouer() {
        System.out.println("Le lecteur DVD joue le DVD");
    }

    public void stop() {
        System.out.println("Le lecture DVD stoppe le DVD");
    }
}
