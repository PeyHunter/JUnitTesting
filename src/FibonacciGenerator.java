import java.util.Arrays;

public class FibonacciGenerator
{

    private int[] fib;

    public static int[] generate(int count)
    {

        int[] fib = new int[count];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < count; i++)
        {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }


    @Override
    public String toString()
    {
        return Arrays.toString(fib);
    }

}

