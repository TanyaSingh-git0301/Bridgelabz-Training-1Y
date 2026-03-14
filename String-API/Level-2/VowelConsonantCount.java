import java.util.Scanner;

class VowelConsonantCount {

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
            return "Not Letter";
        }
    }

    public static int[] countVC(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowels++;
            }
            else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        int count[] = {vowels, consonants};

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int result[] = countVC(text);

        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        sc.close();
    }
}
