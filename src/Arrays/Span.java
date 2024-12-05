package Arrays;

public class Span
{
    public static int findSpan(int[] arr)
    {
        int max = arr[0];
        int min = arr[0];
        int span = 0;
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        span = max - min;
        return span;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,3,4,5,6,7,8,9};

        System.out.println(findSpan(arr));

    }
}
