import java.util.Scanner;

class IllegalArgumentDemo {

    public static void generateException(String text) {
        String result = text.substring(5, 2);

        System.out.println("Substring is: " + result);
    }
    public static void handleUsingIfElse(String text) {
        int start = 5;
        int end = 2;

        if (start >= 0 && end <= text.length() && start < end) {
            String result = text.substring(start, end);
            System.out.println("Substring is: " + result);
        }
        else {
            System.out.println("Error: Invalid indexes.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        handleUsingIfElse(text);

        sc.close();
    }
}
