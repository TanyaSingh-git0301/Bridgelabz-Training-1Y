import java.util.Scanner;

class StringIndexDemo {

    public static void generateException(String text) {
        
        char ch = text.charAt(text.length());
        
        System.out.println("Character: " + ch);
    }

    public static void handleUsingIfElse(String text) {
        int index = text.length();

        if (index >= 0 && index < text.length()) {
            char ch = text.charAt(index);
            System.out.println("Character: " + ch);
        }
        else {
            System.out.println("Error: Index is out of bounds.");
            System.out.println("Valid index range is 0 to " + (text.length() - 1));
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
