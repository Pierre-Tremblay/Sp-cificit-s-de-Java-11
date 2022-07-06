package ExerciceAPI;

public class Coord {
    public double lon;
    public double lat;

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coord{");
        sb.append("lon=").append(lon);
        sb.append(", lat=").append(lat);
        sb.append('}');
        return sb.toString();
    }
}
