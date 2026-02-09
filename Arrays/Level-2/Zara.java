import java.util.Scanner;

class Zara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double temp[][] = new double[10][2];
        double result[][] = new double[10][2];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Years of Service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years <= 0) {
                System.out.println("Invalid input! Enter again.");
                i--;
                continue;
            }

            temp[i][0] = salary;
            temp[i][1] = years;
        }
        for (int i = 0; i < 10; i++) {
            double salary = temp[i][0];
            double years = temp[i][1];

            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
