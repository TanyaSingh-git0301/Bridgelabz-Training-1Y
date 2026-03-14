import java.util.Scanner;

class BMIProgram
{

    public static double[][] inputData(int n, Scanner sc)
    {
        double data[][] = new double[n][2];

        for(int i = 0; i < n; i++)
        {
            System.out.println("\nPerson " + (i+1));

            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        return data;
    }


    public static String[][] calculateBMI(double data[][])
    {
        int n = data.length;

        String result[][] = new String[n][4];

        for(int i = 0; i < n; i++)
        {
            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);

            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;

            if(bmi <= 18.4)
                status = "Underweight";
            else if(bmi <= 24.9)
                status = "Normal";
            else if(bmi <= 39.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }


    public static void display(String result[][])
    {
        System.out.println("\nBMI Report:");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for(int i = 0; i < result.length; i++)
        {
            System.out.println((i+1) + "\t" +
                               result[i][0] + "\t\t" +
                               result[i][1] + "\t\t" +
                               result[i][2] + "\t" +
                               result[i][3]);
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        double data[][] = inputData(n, sc);

        String result[][] = calculateBMI(data);

        display(result);

        sc.close();
    }
}
