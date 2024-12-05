
public class Factorial
{
    private static int fact(int num)
    {
        int res=1;
        for (int i = 1; i<=num; i++)
        {
            res = res*i;
        }
       return res;
    }

    public static void main(String[] args)
    {
        System.out.println(fact(5));
    }

}

