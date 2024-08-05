//Find the Number Of Trailing Zeros In A Factorial / trailing zeros nothing but result factorial getting for a number in the result how many zeros we got at the end of example  34505300  answer = 2 zeros
//intput:10
//output:2
//input: 5
//output: 1

public class TrailingZeros
{
    static int trailingZeros(int num)
    {
        int res = 0;
        int powOf5=5;
        while (num >= powOf5)
        {
            res = res+(num/powOf5);
            powOf5=powOf5*5;
        }
        return res;
    }

    public static void main(String[] args)
    {
        System.out.println(trailingZeros(200));
    }
}
