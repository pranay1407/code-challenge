package GcdHcf;

public class GcdEuclidesAlgo
{
    public static int euclidGcd(int a, int b)
    {
        while (a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    public static void main(String[] args)
    {
        System.out.println(euclidGcd(20,15));

    }
}
