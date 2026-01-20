import java.util.Scanner;

class TotalPrice {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the unit price: ");
        double price = s.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = s.nextInt();
        double total = price * quantity;
        System.out.println("Total price: " + total);
    }
}