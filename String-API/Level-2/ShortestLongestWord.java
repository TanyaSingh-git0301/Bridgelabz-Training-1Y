import java.util.Scanner;

class ShortestLongestWord {

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

    public static int[] findShortestLongest(String[][] table) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int shortestLength = Integer.parseInt(table[0][1]);
        int longestLength = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {

            int len = Integer.parseInt(table[i][1]);

            if (len < shortestLength) {
                shortestLength = len;
                shortestIndex = i;
            }

            if (len > longestLength) {
                longestLength = len;
                longestIndex = i;
            }
        }

        int result[] = {shortestIndex, longestIndex};

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);

        String[][] table = createWordLengthArray(words);

        int[] indexes = findShortestLongest(table);

        int shortestIndex = indexes[0];
        int longestIndex = indexes[1];

        System.out.println("Words and Lengths:");
        for (int i = 0; i < table.length; i++) {

            String word = table[i][0];
            int len = Integer.parseInt(table[i][1]);

            System.out.println(word + " : " + len);
        }

        System.out.println("Shortest Word: " + table[shortestIndex][0]);
        System.out.println("Length: " + table[shortestIndex][1]);

        System.out.println("Longest Word: " + table[longestIndex][0]);
        System.out.println("Length: " + table[longestIndex][1]);

        sc.close();
    }
}
