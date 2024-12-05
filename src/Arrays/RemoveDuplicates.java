package Arrays;

public class RemoveDuplicates
{
    public static int rmDuplicates(int[] arr)
    {
        int rm=0;
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[rm] != arr[i])
            {
                rm++;
                arr[rm] = arr[i];
            }
        }
        return rm+1;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,2,3,4,5,5,7,8,8,9};
        int rm = rmDuplicates(arr);
        for (int i = 0; i < rm; i++) {
            System.out.println(arr[i]);
        }
    }
}
