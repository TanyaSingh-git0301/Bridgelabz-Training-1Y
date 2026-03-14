import java.util.Scanner;

class StringLengthDemo {

    public static int findLength(String text) {

        char[] arr = text.toCharArray();
        int count = 0;
        int i = 0;
        while (true) {

            if (i < arr.length) {
                count++;
                i++;
            }
            else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int manualLength = findLength(text);
        int builtinLength = text.length();
        System.out.println("Length using user-defined method: " + manualLength);
        System.out.println("Length using built-in method: " + builtinLength);

        sc.close();
    }
}
