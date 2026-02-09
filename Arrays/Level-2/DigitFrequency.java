import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int digits[] = new int[count];
        int freq[] = new int[10];

        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " : " + freq[i]);
            }
        }
    }
}
