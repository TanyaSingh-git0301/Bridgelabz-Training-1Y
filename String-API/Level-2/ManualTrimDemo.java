import java.util.Scanner;

class ManualTrimDemo {

    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        int result[] = {start, end};

        return result;
    }

    public static String manualSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int indexes[] = findTrimIndexes(text);

        int start = indexes[0];
        int end = indexes[1];

        String manualTrim = manualSubstring(text, start, end);

        String builtinTrim = text.trim();

        boolean result = compareStrings(manualTrim, builtinTrim);

        System.out.println("Manual Trim Result: '" + manualTrim + "'");
        System.out.println("Built-in Trim Result: '" + builtinTrim + "'");
        System.out.println("Are both equal? " + result);

        sc.close();
    }
}
