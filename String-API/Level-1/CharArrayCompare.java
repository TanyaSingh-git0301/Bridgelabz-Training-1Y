import java.util.Scanner;

class CharArrayCompare {

    static char[] getCharacters(String str) {

        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] arr1 = getCharacters(text);

        char[] arr2 = text.toCharArray();

        boolean result = compareArrays(arr1, arr2);

        System.out.print("Characters using user-defined method: ");
        for (char c : arr1) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char c : arr2) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.println("Are both arrays equal? " + result);

        sc.close();
    }
}
