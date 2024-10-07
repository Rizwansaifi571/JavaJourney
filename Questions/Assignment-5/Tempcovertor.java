class TemperatureConverter {
    private double temperature;

    // Constructor to initialize temperature in Celsius
    public TemperatureConverter(double tempCelsius) {
        this.temperature = tempCelsius;
        System.out.println("Initialized with temperature in Celsius: " + tempCelsius + "°C");
    }

    // Constructor to initialize temperature in Fahrenheit
    public TemperatureConverter(double tempFahrenheit, boolean isFahrenheit) {
        if (isFahrenheit) {
            this.temperature = tempFahrenheit;
            System.out.println("Initialized with temperature in Fahrenheit: " + tempFahrenheit + "°F");
        }
    }

    // Overloaded method to convert Celsius to Fahrenheit
    public double convertToFahrenheit() {
        return (temperature * 9 / 5) + 32;
    }

    // Overloaded method to convert Fahrenheit to Celsius
    public double convertToCelsius() {
        return (temperature - 32) * 5 / 9;
    }
}

public class Tempcovertor {
    public static void main(String[] args) {
        // Initialize temperature in Celsius
        TemperatureConverter tempCelsius = new TemperatureConverter(25.0);
        double tempInFahrenheit = tempCelsius.convertToFahrenheit();
        System.out.println("Converted to Fahrenheit: " + tempInFahrenheit + "°F");

        // Initialize temperature in Fahrenheit
        TemperatureConverter tempFahrenheit = new TemperatureConverter(77.0, true);
        double tempInCelsius = tempFahrenheit.convertToCelsius();
        System.out.println("Converted to Celsius: " + tempInCelsius + "°C");
    }
}
