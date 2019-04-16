import java.util.Map;

abstract class Display {
    protected String area;
    protected float temporature;
    protected float humidity;
    protected float barometricPressure;
    public void update(String area, float temporature, float humidity, float barometricPressure) {
        this.area = area;
        this.temporature = temporature;
        this.humidity = humidity;
        this.barometricPressure = barometricPressure;
    }
    public abstract void display();

}
