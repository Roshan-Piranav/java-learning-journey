//print the first duplicate number 

package java_rps;

public class lt {
    public static void main(String[] args) {

        int[] arr = { 3, 1, 3, 4, 2 };

        for (int i = 0; i < arr.length; i++) {
            int l = i + 1;
            int h = arr.length - 1;

            while (l <= h) {
                if (arr[l] == arr[i]) {
                    System.out.println("The duplicate number is: " + arr[l]);
                    return;
                }
                if (arr[h] == arr[i]) {
                    System.out.println("The duplicate number is: " + arr[h]);
                    return;
                }
                l++;
                h--;
            }
        }
        System.out.println("No duplicate found");
    }
}
