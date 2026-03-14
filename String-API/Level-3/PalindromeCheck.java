import java.util.Scanner;

class PalindromeCheck
{

    public static boolean isPalindromeIterative(String text)
    {
        int start = 0;
        int end = text.length() - 1;

        while(start < end)
        {
            if(text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }


    public static boolean isPalindromeRecursive(String text, int start, int end)
    {
        if(start >= end)
            return true;

        if(text.charAt(start) != text.charAt(end))
            return false;

        return isPalindromeRecursive(text, start + 1, end - 1);
    }


    public static char[] reverseString(String text)
    {
        char reverse[] = new char[text.length()];

        int index = 0;

        for(int i = text.length() - 1; i >= 0; i--)
        {
            reverse[index] = text.charAt(i);
            index++;
        }

        return reverse;
    }


    public static boolean isPalindromeArray(String text)
    {
        char original[] = text.toCharArray();
        char reverse[] = reverseString(text);

        for(int i = 0; i < original.length; i++)
        {
            if(original[i] != reverse[i])
                return false;
        }

        return true;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = isPalindromeIterative(text);

        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);

        boolean result3 = isPalindromeArray(text);


        System.out.println("\nUsing Iterative Method: " +
                (result1 ? "Palindrome" : "Not Palindrome"));

        System.out.println("Using Recursive Method: " +
                (result2 ? "Palindrome" : "Not Palindrome"));

        System.out.println("Using Character Array Method: " +
                (result3 ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
