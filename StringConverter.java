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
        // check if front half is the same as reversed back half
        int half = str.length() / 2;
        String front = str.substring(0, half);
        String back = "";
        // if odd, don't include middle letter
        if (str.length() % 2 == 1)
        {
            back = str.substring(half + 1);
        }
        // if even, just last half
        else back = str.substring(half);
        back = backwards(back);
        if (front.equalsIgnoreCase(back))
        {
            // return true if same
            return true;
        }
        // else return false
        return false;
    }

    // Pig Latin
    public static String pigLatinate(String str)
    {
        // search through words for vowels
        String vowels = "aeiouAEIOU";
        // remove punctuation marks?
        str = str.replaceAll("\\p{Punct}","");
        // if first letter contains vowel
        if (vowels.indexOf(str.charAt(0)) >= 0)
        {
            // return str + "yay"
            return str + "yay";
        }
        // iterate over each letter in word
        for (int i = 1; i < str.length(); i++)
        {
            // if contains any more vowels, get index of first vowel
            if (vowels.indexOf(str.substring(i, i + 1)) >= 0)
            {
                // get start, which is first word until but not including first vowel
                String start = str.substring(0, i);
                // get end, which is the rest of the word
                String end = str.substring(i);
                // if capitalized
                if (Character.isUpperCase(str.charAt(0)))
                {
                    // capitalize end, uncapitalize start
                    end = end.toUpperCase();
                    start = start.toLowerCase();
                }
                // return end + start + "ay"
                return end + start + "ay";
            }
        }
        // else
        // return str + "ay"
        return str + "ay";
    }

    // Shorthand
    public static String shorthand(String str)
    {
        // Add space before and after to ensure only change words
        str = " " + str + " ";
        // replace all " and " and " And " with " & "
        str = str.replaceAll(" and ", " & ");
        str = str.replaceAll(" And ", " & ");
        // replace all " to " and " To " with "2"
        str = str.replaceAll(" to ", " 2 ");
        str = str.replaceAll(" To ", " 2 ");
        // replace all " you " and " You " with "U"
        str = str.replaceAll(" you ", " U ");
        str = str.replaceAll(" You ", " U ");
        // replace all " for " and " For " with "4"
        str = str.replaceAll(" for ", " 4 ");
        str = str.replaceAll(" For ", " 4 ");
        // search through words for vowels
        String vowels = "aeiouAEIOU";
        // iterate over each letter backwards
        for (int i = str.length() - 1; i > 0; i--)
        {
            // skip if white space before and after letter
            if ((Character.isWhitespace(str.charAt(i - 1))) && (Character.isWhitespace(str.charAt(i + 1))))
            {
                i--;
            }
            // remove all vowels
            if (vowels.indexOf(str.substring(i, i + 1)) >= 0)
            {
                str = str.substring(0, i) + str.substring(i + 1);
            }
        }
        // return new string
        // remove front and back spaces
        return str.trim();
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