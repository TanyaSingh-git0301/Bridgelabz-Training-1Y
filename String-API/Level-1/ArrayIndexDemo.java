import java.util.Scanner;

class ArrayIndexDemo {

    public static void generateException(String names[]) {
        System.out.println("Name is: " + names[names.length]);
    }

    public static void handleUsingIfElse(String names[]) {

        int index = names.length;
        if (index >= 0 && index < names.length) {
            System.out.println("Name is: " + names[index]);
        }
        else {
            System.out.println("Error: Array index is out of bounds.");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String names[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        handleUsingIfElse(names);

        sc.close();
    }
}
