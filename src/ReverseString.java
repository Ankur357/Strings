import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String rstr = "";
//        char ch;
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//            rstr = ch+rstr;
//        }
//        System.out.println(rstr);

        //USing String Builder
//        StringBuilder rstr = new StringBuilder();
//        rstr.append(str);
//        rstr.reverse();
//        System.out.println(rstr);

        // Using toCharArray method
//        char str1[] = str.toCharArray();
//        for (int i = str1.length-1; i >=0; i--) {
//            System.out.print(str1[i]);

        // Using Stack
        char str1[] = new char[str.length()];
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        int i=0;
        while (!s.isEmpty()){
            str1[i++] = s.pop();
        }
        for (int j = 0; j < str1.length; j++) {
            System.out.print(str1[j]);
        }
    }
}
