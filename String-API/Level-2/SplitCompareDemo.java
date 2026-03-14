import java.util.Scanner;

class SplitCompareDemo {

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

    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {

            String w1 = arr1[i];
            String w2 = arr2[i];

            if (findLength(w1) != findLength(w2)) {
                return false;
            }

            for (int j = 0; j < findLength(w1); j++) {

                if (w1.charAt(j) != w2.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] manualWords = manualSplit(text);

        String[] builtinWords = text.split(" ");

        boolean result = compareArrays(manualWords, builtinWords);

        System.out.println("Manual Split Words:");
        for (int i = 0; i < manualWords.length; i++) {
            System.out.println(manualWords[i]);
        }

        System.out.println("Built-in Split Words:");
        for (int i = 0; i < builtinWords.length; i++) {
            System.out.println(builtinWords[i]);
        }

        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
