import java.util.Scanner;

class FrequencyUsingUnique
{

    public static char[] uniqueCharacters(String text)
    {
        char temp[] = new char[text.length()];
        int uniqueCount = 0;

        for(int i = 0; i < text.length(); i++)
        {
            char current = text.charAt(i);
            boolean isUnique = true;

            for(int j = 0; j < uniqueCount; j++)
            {
                if(temp[j] == current)
                {
                    isUnique = false;
                    break;
                }
            }

            if(isUnique)
            {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        char result[] = new char[uniqueCount];

        for(int i = 0; i < uniqueCount; i++)
        {
            result[i] = temp[i];
        }

        return result;
    }


    public static String[][] findFrequency(String text)
    {
        int freq[] = new int[256];

        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        char unique[] = uniqueCharacters(text);

        String result[][] = new String[unique.length][2];

        for(int i = 0; i < unique.length; i++)
        {
            char ch = unique[i];

            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
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
