public class ReverseNumber
{

    public static int reverseNumber(int number)
    {
        int reversedNumber=0;
        int temp;
        while (number > 0)
        {
            temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number = number/10;
        }
        return reversedNumber;
    }
    public static void main(String[] args)
    {
        int number=343;
        int noRev = reverseNumber(number);
        if(noRev==number)
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");

    }
}
