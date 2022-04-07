import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // USing Sort method
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
        //or
        System.out.println(new String(arr));
    }
}
