import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	public static void read_file(String filename) {
		try {
			List<String> allLines = Files.readAllLines(Paths.get(filename));

			for (String line : allLines) {
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    public static void main(String[] args) { 
        WeatherData taiwanWeatherData = new WeatherData();
        CurrentConditionsDisplay taiwanCurrentConditionsDisplay = new CurrentConditionsDisplay();
        WeatherStatisticsDisplay taiwanWeatherStatisticsDisplay = new WeatherStatisticsDisplay();
        SimpleForecastDisplay taiwanSimpleForecastDisplay = new SimpleForecastDisplay();
        taiwanWeatherData.attach("taiwanCurrentConditionsDisplay", taiwanCurrentConditionsDisplay);
        taiwanWeatherData.attach("taiwanSimpleForecastDisplay", taiwanSimpleForecastDisplay);
        taiwanWeatherData.attach("taiwanWeatherStatisticsDisplay", taiwanWeatherStatisticsDisplay);
        taiwanWeatherData.update("Taiwan", 23, 10, 1000);
        taiwanCurrentConditionsDisplay.display();
        taiwanWeatherStatisticsDisplay.display();
        taiwanSimpleForecastDisplay.display();
        //String filename = args[0];
        //read_file(filename);
    }

}
