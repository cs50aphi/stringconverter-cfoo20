// StringConverter by Cheyenne Foo
public class StringConverter
{
    // Reverse
    public static String reverse(String str)
    {
        return backwards(str);
    }

    // Palindrome
    public static boolean checkPalindrome(String str)
    {
        // remove all spaces and punctuation marks
        str = str.replaceAll("\\p{Punct}","");
        str = str.replaceAll("\\s", "");
        // convert all letters to lowercase
        // only check if even number of chars
        if (str.length() % 2 == 1)
        {
            // else return false
            return false;
        }
        // check if front half is the same as reversed back half
        int half = str.length() / 2;
        String front = str.substring(0, half);
        String back = str.substring(half);

            // return true if same
        // else return false
        return false;
    }

    // Pig Latin
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

    // Shorthand
    public static String shorthand(String str)
    {
        // Add space before and after to ensure only change words
        // replace all " and " and " And " with "&"
        // replace all " to " and " To " with "2"
        // replace all " you " and " You " with "U"
        // replace all " for " and " For " with "4"
        // iterate over each letter in word
            // unless it was " you " or " You " before (campare old and new string)
            // remove all vowels
        // return new string
        return "";
    }

    // backwards helper?? (just reverse)
    private static String backwards(String str)
    {
        // run through each char backwards
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            // store each char in a reversed variable
            reversed += str.charAt(i);
        }
        // return reversed variable
        return reversed;
    }
}