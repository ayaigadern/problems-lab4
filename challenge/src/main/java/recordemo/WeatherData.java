package recordemo;

import java.util.Locale;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius*9/5 +32;

    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        String summary=String.format(Locale.US, "%.2f\u00B0C (%.2f\u00B0F) and %s",temperatureCelsius,temperatureFahrenheit(),conditions);
        return summary;
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       double tempCelsius=(tempFahrenheit-32)*5/9;
       return new WeatherData(tempCelsius,conditions);
    }

    public static void main(String[] args) {
        System.out.print("Today's weather: ");
        WeatherData weather=new WeatherData(25,"Sunny");
        System.out.println(weather.getSummary());
        System.out.print("Yesterday's weather: ");
        WeatherData weather2 =weather.fromFahrenheit(50,"Cloudy");
        System.out.println(weather2.getSummary());

    }
}
