public class StringManipulator
{
    public String reverseString(String input)
    {
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        return reversed;
    }

    public boolean isPalindrome(String input)
    {   
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        return input.equals(reversed);
    }
}