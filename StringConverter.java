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
        // remove all spaces and punctuation marks
        // convert all letters to lowercase
        // only check if even number of chars
            // else return false
        // check if front half is the same as reversed back half
            // return true if false
        // else return false
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