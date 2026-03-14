import java.util.Scanner;

class StudentGradeProgram
{

    public static int[][] generateScores(int n)
    {
        int scores[][] = new int[n][3];

        for(int i = 0; i < n; i++)
        {
            scores[i][0] = (int)(Math.random() * 90) + 10; 
            scores[i][1] = (int)(Math.random() * 90) + 10; 
            scores[i][2] = (int)(Math.random() * 90) + 10; 
        }

        return scores;
    }


    public static double[][] calculateResults(int scores[][])
    {
        int n = scores.length;
        double results[][] = new double[n][3]; 

        for(int i = 0; i < n; i++)
        {
            int total = scores[i][0] + scores[i][1] + scores[i][2];

            double average = total / 3.0;
            double percentage = total / 3.0;

           
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }


    
    public static String[] calculateGrade(double results[][])
    {
        int n = results.length;
        String grade[] = new String[n];

        for(int i = 0; i < n; i++)
        {
            double percent = results[i][2];

            if(percent >= 80)
                grade[i] = "A";
            else if(percent >= 70)
                grade[i] = "B";
            else if(percent >= 60)
                grade[i] = "C";
            else if(percent >= 50)
                grade[i] = "D";
            else if(percent >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        return grade;
    }


    
    public static void displayScorecard(int scores[][], double results[][], String grade[])
    {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");

        for(int i = 0; i < scores.length; i++)
        {
            System.out.println((i+1) + "\t" +
                               scores[i][0] + "\t" +
                               scores[i][1] + "\t\t" +
                               scores[i][2] + "\t" +
                               results[i][0] + "\t" +
                               results[i][1] + "\t" +
                               results[i][2] + "\t\t" +
                               grade[i]);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int scores[][] = generateScores(n);

        double results[][] = calculateResults(scores);

        String grade[] = calculateGrade(results);

        displayScorecard(scores, results, grade);

        sc.close();
    }
}
