public class FibonacciSeries
{
    public static void main(String[] args)
    {

        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<10;i++)
        {
             c=a+b;
            System.out.println(a +" "+b+" ="+c);
            a=b;
            b=c;
        }

    }
}
