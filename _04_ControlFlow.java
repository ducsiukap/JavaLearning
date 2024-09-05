import java.util.Scanner;
public class _04_ControlFlow {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
//        IF - ELSE IF - ELSE
        /* structure:
        if (condition1) { body}
        else if (condition2) {body}
        ...
        else {body}
         */
//        SWITCH - CASE
        int month = buf.nextInt();
        switch (month) {
            case 2:
                System.out.println(28);
                break;
            case 4: case 6: case 9: case 11:
                System.out.println(30);
                break;
            default:
                System.out.println(31);
        }

//        LOOP
        // while (boolean) {body}
        // for (init, condition, step) {body}
        // do {body} while (boolean)
        // for (item : storage) {body}
    }
}
