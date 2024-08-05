// How To Count The Number Of Digits In A Number?
// Example:
// input = 2357
// output = 4

public class CountDigit
{
    public static int count(int num)
    {
        int count = 0;
        while (num>0)
        {
            num = num/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(count(5683));
    }
}

