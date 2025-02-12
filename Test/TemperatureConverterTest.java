import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest
{

    @Test
    public void toCelciusTest1()
    {
        assertEquals(38.0, TemperatureConverter.toCelcius(100.00));
    }

    @Test
    public void toCelciusTest2()
    {
        assertEquals(-18.0, TemperatureConverter.toCelcius(00.00));
    }

    @Test
    public void toFerhenheitTest1()
    {
        assertEquals(68.0, TemperatureConverter.toFahrenheit(20.00));
    }

    @Test
    public void toFerhenheitTest2()
    {
        assertEquals(50.0, TemperatureConverter.toFahrenheit(10.00));
    }

}