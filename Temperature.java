public class Temperature
{
  /**
     * converts a temperature from Celsius to Fahrenheit
     */
    public double convertTemperature(double celsius)
    {
      double f = celsius * 1.8 + 32;
      return f;
    }
}
