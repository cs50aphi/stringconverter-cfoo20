// StringConverter by Cheyenne Foo
public class StringConverter
{
    public static String reverse(String str)
    {
        String reversed = "";
        // run through each char backwards
        for (int i = str.length() - 1; i >= 0; i--)
        {
            // store each char in a reversed variable
            reversed += str.charAt(i);
        }
        // return reversed variable
        return reversed;
    }
    public static boolean checkPalindrome(String str)
    {
        return false;
    }
    public static String pigLatinate(String str)
    {
        return "";
    }
    public static String shorthand(String str)
    {
        return "";
    }
}