import java.util.Scanner;

class UniqueCharacters
{

    public static int findLength(String text)
    {
        int count = 0;

        while(true)
        {
            if(text.charAt(count) == '\0')
                break;
            count++;

            if(count >= text.toCharArray().length)
                break;
        }

        return count;
    }


    public static char[] findUnique(String text)
    {
        int len = findLength(text);

        char temp[] = new char[len];

        for(int i = 0; i < len; i++)
        {
            char current = text.charAt(i);
            boolean isUnique = true;

            for(int j = 0; j < i; j++)
            {
                if(current == text.charAt(j))
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


    public static void display(char arr[])
    {
        System.out.print("Unique characters are: ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char uniqueChars[] = findUnique(text);

        display(uniqueChars);

        sc.close();
    }
}
