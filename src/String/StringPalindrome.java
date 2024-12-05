package String;

public class StringPalindrome
{

    public static StringBuffer revString(String str)
    {
        StringBuffer sb = new StringBuffer();
        for (int i=str.length()-1; i>=0; i--)
        {
            sb.append(str.charAt(i));
        }
        return sb;
    }

    public static void main(String[] args)
    {
        String str = "aba";
        String sb = String.valueOf(revString(str));
        if(str.equals(sb))
            System.out.println("String is a palindrome");
        else
            System.out.println("String is not a palindrome");

    }
}
