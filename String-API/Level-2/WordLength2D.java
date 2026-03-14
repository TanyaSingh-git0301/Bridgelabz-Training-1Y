import java.util.Scanner;

class WordLength2D {

    public static int findLength(String text) {

        char[] arr = text.toCharArray();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        return count;
    }

    public static String[] manualSplit(String text) {

        int length = findLength(text);

        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++) {
                    word = word + text.charAt(j);
                }

                words[index] = word;
                index++;
                start = i + 1;
            }
        }

        String word = "";
        for (int j = start; j < length; j++) {
            word = word + text.charAt(j);
        }

        words[index] = word;

        return words;
    }
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];

            int len = findLength(words[i]);

            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);

        String[][] table = createWordLengthArray(words);

        System.out.println("Word Length");

        for (int i = 0; i < table.length; i++) {

            String word = table[i][0];

            int length = Integer.parseInt(table[i][1]);

            System.out.println(word + " " + length);
        }

        sc.close();
    }
}
