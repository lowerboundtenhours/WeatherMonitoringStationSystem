import java.util.ArrayList;

abstract class Display {
    protected String area;
    protected ArrayList<Float> temporature;
    protected ArrayList<Float> humidity;
    protected ArrayList<Float> barometricPressure;
    public void update(String area, ArrayList<Float> temporature, ArrayList<Float> humidity,
                       ArrayList<Float> barometricPressure) {
        this.area = area;
        this.temporature = temporature;
        this.humidity = humidity;
        this.barometricPressure = barometricPressure;
    }
    public abstract void display();

}
