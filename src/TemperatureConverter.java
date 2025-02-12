public class TemperatureConverter
{
    public static double toCelcius(double fahrenheit)
    {
        return Math.round((fahrenheit - 32 ) * 5 / 9);
    }

    public static double toFahrenheit (double celcius)
    {
        return Math.round((celcius * 9 / 5 ) + 32);
    }

}
