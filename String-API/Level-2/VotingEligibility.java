import java.util.Scanner;

class VotingEligibility {

    public static int[] getAges(int n) {

        Scanner sc = new Scanner(System.in);

        int ages[] = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    public static String[][] checkVoting(int ages[]) {

        String result[][] = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; 
            }
            else if (ages[i] >= 18) {
                result[i][1] = "true"; 
            }
            else {
                result[i][1] = "false"; 
            }
        }

        return result;
    }

    public static void display(String table[][]) {

        System.out.println("Age Can Vote");

        for (int i = 0; i < table.length; i++) {

            int age = Integer.parseInt(table[i][0]);

            boolean canVote = Boolean.parseBoolean(table[i][1]);

            System.out.println(age + " " + canVote);
        }
    }

    public static void main(String[] args) {

        int numberOfStudents = 10;

        int ages[] = getAges(numberOfStudents);

        String result[][] = checkVoting(ages);

        display(result);
    }
}
