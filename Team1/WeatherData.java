import java.util.Map;
import java.util.HashMap;

public class WeatherData {
    private String area;
    private float temporature;
    private float humidity;
    private float barometricPressure;
    private Map<String, Display> displays = new HashMap<String, Display>();


    public void attach(String name, Display display) {
        this.displays.put(name, display);
    }

    public void dettach(String name, Display display) {
    }

    public void notify_() {
        for (Map.Entry<String, Display> entry : this.displays.entrySet()) {
            entry.getValue().update(this.area, this.temporature, this.humidity, this.barometricPressure);
        }
    }
    public void update(String area, float temporature, float humidity, float barometricPressure) {
        this.area = area;
        this.temporature = temporature;
        this.humidity = humidity;
        this.barometricPressure = barometricPressure;
        this.notify_();
    }

}

