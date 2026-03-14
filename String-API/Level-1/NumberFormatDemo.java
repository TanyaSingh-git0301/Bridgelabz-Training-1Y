import java.util.Scanner;

class NumberFormatDemo {
    public static void generateException(String text) {

        int number = Integer.parseInt(text);

        System.out.println("Number is: " + number);
    }

    public static void handleUsingIfElse(String text) {

        boolean isNumber = true;

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                isNumber = false;
                break;
            }
        }

        if (isNumber && text.length() > 0) {
            int number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        } else {
            System.out.println("Error: Input is not a valid number.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String text = sc.nextLine();
        handleUsingIfElse(text);

        sc.close();
    }
}
