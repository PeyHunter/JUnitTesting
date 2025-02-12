import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest
{
    @Test
    public void reverseTest1()
    {
        //String result = StringReverser.reverse("Cay");
        //assertEquals("yaC", result);

    assertEquals("yaC", StringReverser.reverse("Cay"));
    }

    @Test
    public void reverseTest2()
    {
        assertEquals("saiboT", StringReverser.reverse("Tobias"));
    }
    @Test
    public void reverseTest3()
    {
        assertEquals("ayamuS", StringReverser.reverse("Sumaya"));
    }

}