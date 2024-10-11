import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,4,5,7,8,9,0};
        System.out.print("Find a number to delete: ");
        int num = scanner.nextInt();
        boolean found = false;
        int index_del = -1;

        while (!found) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    index_del = i;
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print("Find a number to delete: ");
                num = scanner.nextInt();
            }
        }



        for (int j = index_del; j < arr.length-1; j++) {
            arr[j] = arr[j+1];
        }
        System.out.println(Arrays.toString(arr));


    }
}
