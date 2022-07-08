package fr.diginamic.cinéphile.bo;

public class Amplificateurs extends Button {

    private Tuner tuner;
    private String dvd;
    private String cd;

    private boolean sonStereo;
    private boolean sonSurround;
    private int volume;

    @Override
    public void marche() {
        System.out.println("L'amplificateur marche");
    }

    @Override
    public void arret() {
        System.out.println("L'amplificateur est arrêté");
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public boolean isSonStereo() {
        return sonStereo;
    }

    public void setSonStereo(boolean sonStereo) {
        this.sonStereo = sonStereo;
    }

    public boolean isSonSurround() {
        return sonSurround;
    }

    public void setSonSurround(boolean sonSurround) {
        this.sonSurround = sonSurround;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
