import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest
{
    @Test
    public void personTest1()
    {
        Person person1 = new Person("Sumaya", 21);
        assertEquals("Sumaya", person1.getName());
        assertEquals(21, person1.getAge());
    }


    @Test
    public void personTest2()
    {
        Person person1 = new Person("Pey", 30);
        assertEquals("Pey", person1.getName());
        assertEquals(30, person1.getAge());
    }

}