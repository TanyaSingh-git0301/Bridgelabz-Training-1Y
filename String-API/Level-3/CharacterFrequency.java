import java.util.Scanner;

class CharacterFrequency
{

    public static String[][] findFrequency(String text)
    {
        int freq[] = new int[256];

        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            freq[ch] = freq[ch] + 1;
        }

        int uniqueCount = 0;
        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);

            if(freq[ch] != 0)
            {
                uniqueCount++;
                freq[ch] = -freq[ch];
            }
        }

        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if(freq[ch] < 0)
                freq[ch] = -freq[ch];
        }
        String result[][] = new String[uniqueCount][2];

        int index = 0;

        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);

            if(freq[ch] != 0)
            {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);

                freq[ch] = 0; 
                index++;
            }
        }

        return result;
    }


    public static void display(String result[][])
    {
        System.out.println("\nCharacter\tFrequency");

        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String result[][] = findFrequency(text);

        display(result);

        sc.close();
    }
}
