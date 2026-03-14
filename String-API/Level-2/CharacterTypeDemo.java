import java.util.Scanner;

class CharacterTypeDemo {

    public static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            else {
                return "Consonant";
            }
        }
        else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeText(String text) {

        int length = text.length();

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {

            char ch = text.charAt(i);

            result[i][0] = String.valueOf(ch);

            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    public static void display(String[][] table) {

        System.out.println("Character Type");

        for (int i = 0; i < table.length; i++) {

            System.out.println(table[i][0] + "  " + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = analyzeText(text);

        display(result);

        sc.close();
    }
}
