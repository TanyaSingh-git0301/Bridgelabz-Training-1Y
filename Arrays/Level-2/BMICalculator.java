import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of persons: ");
        int n = sc.nextInt();

        double height[] = new double[n];
        double weight[] = new double[n];
        double bmi[] = new double[n];
        String status[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();

            System.out.print("Weight (in kg): ");
            weight[i] = sc.nextDouble();

            if (height[i] <= 0 || weight[i] <= 0) {
                System.out.println("Invalid input, Enter again");
                i--;
                continue;
            }
        }
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) +
                    " Height: " + height[i] +
                    " Weight: " + weight[i] +
                    " BMI: " + bmi[i] +
                    " Status: " + status[i]);
        }
    }
}
