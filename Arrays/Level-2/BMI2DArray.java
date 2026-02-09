import java.util.Scanner;

class BMI2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Height (in meters): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Weight (in kg): ");
            personData[i][1] = sc.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input, Enter again");
                i--;
                continue;
            }
        }
        for (int i = 0; i < number; i++) {
            personData[i][2] =
                    personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        for (int i = 0; i < number; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " Height: " + personData[i][0] + " m" +
                " Weight: " + personData[i][1] + " kg" +
                " BMI: " + personData[i][2] +
                " Status: " + weightStatus[i]
            );
        }
    }
}
