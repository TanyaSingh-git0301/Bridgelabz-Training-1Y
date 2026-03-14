import java.util.Scanner;

class FirstNonRepeatingCharacter
{

    public static char findFirstNonRepeating(String text)
    {
        int freq[] = new int[256];

        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            freq[ch] = freq[ch] + 1;
        }
        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);

            if(freq[ch] == 1)
            {
                return ch;
            }
        }
        return '\0';
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if(result == '\0')
            System.out.println("No non-repeating character found.");
        else
            System.out.println("First non-repeating character is: " + result);

        sc.close();
    }
}
