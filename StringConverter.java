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
        String vowels = "aeiou";
        // search through words for vowels
        // iterate over each letter in word
        // if first letter contains vowel
            // return str + "yay"
        // if contains any more vowels, get index of first vowel
            // get start, which is first word until but not including first vowel
            // get end, which is the rest of the word
            // if capitalized
                // capitalize end, uncapitalize start
            // return end + start + "ay"
        // else
            // return str + "ay"
        return "";
    }
    public static String shorthand(String str)
    {
        return "";
    }
}