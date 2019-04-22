import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WeatherData {
    private String area;
    private ArrayList<Float> temporature = new ArrayList<Float>();
    private ArrayList<Float> humidity = new ArrayList<Float>();
    private ArrayList<Float> barometricPressure = new ArrayList<Float>();
    private LinkedHashMap<String, Display> displays = new LinkedHashMap<String, Display>();

    public void WeatherData(String area) {
        this.area = area;
    }

    public void attach(String name, Display display) {
        this.displays.put(name, display);
    }

    public void dettach(String name, Display display) {
        this.displays.remove(name);
    }

    public void notify_() {
        for (Map.Entry<String, Display> entry : this.displays.entrySet()) {
            entry.getValue().update(this.area, this.temporature, this.humidity, this.barometricPressure);
        }
    }
    public void update(String area, Float temporature, Float humidity, Float barometricPressure) {
        this.area = area;
        this.temporature.add(temporature);
        this.humidity.add(humidity);
        this.barometricPressure.add(barometricPressure);
        this.notify_();
    }

}

