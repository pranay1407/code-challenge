import java.io.IOException;

public class Factors
{

    static int[] printFactors(int num)
    {
        int count = 0;
        for(int i = 1; i<=num; i++)
        {

            if(num%i==0)
            {
                count++;
            }
        }
        int arr[] = new  int[count];
        int j=0;
        for (int i=1; i<=num; i++)
        {

            if(num%i==0) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }


    public static void main(String[] args)
    {
        int[] arr = printFactors(10);
        for(int num:arr)
            System.out.println(num);

    }
}
