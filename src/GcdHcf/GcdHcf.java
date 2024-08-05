package GcdHcf;

public class GcdHcf
{
    static int gcdHcf(int a, int b)
    {
        int min = 0;  //int min = Math.min(a, b);
        if(a>b)
            min = a;
        else
            min = b;

        for(int i=min; i>=1; i--)
        {
            if(a%i==0 && b%i==0)
                return i;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        System.out.println(gcdHcf(15,20));
    }
}
