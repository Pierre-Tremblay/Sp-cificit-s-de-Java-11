package ExerciceAPI;

public class Clouds {
    public int all;



    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clouds{");
        sb.append("all=").append(all);
        sb.append('}');
        return sb.toString();
    }
}
