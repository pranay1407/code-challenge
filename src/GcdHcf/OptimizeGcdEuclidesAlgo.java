package GcdHcf;

public class OptimizeGcdEuclidesAlgo
{
    public static int euclidGcd(int a, int b)
    {
        while (a!=0 && b!=0)
        {
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }
        if(a>0)
            return a;
        else
            return b;
    }

    public static void main(String[] args)
    {
        System.out.println(euclidGcd(15,20));

    }
}
