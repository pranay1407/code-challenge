public class CheckPrime
{

    static boolean numberPrime(int n)
    {

        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {

                return false;
            }

        }

        return true;
    }


    public static void main(String[] args)
    {
        boolean num=numberPrime(12);
        if(num)
            System.out.println("Prime number");
        else
            System.out.println("Non-Prime number");

    }
}
