import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int physics[] = new int[n];
        int chemistry[] = new int[n];
        int maths[] = new int[n];

        double percentage[] = new double[n];
        char grade[] = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = sc.nextInt();

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();

            System.out.print("Maths: ");
            maths[i] = sc.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks, Enter again");
                i--; 
                continue;
            }
        }
        for (int i = 0; i < n; i++) {
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = (total / 300.0) * 100;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " Percentage: " + percentage[i] +
                    " Grade: " + grade[i]);
        }
    }
}
