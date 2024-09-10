import java.io.*;
import java.util.Scanner;

public class _03_IOStandard {
    public static void main(String[] args) throws IOException {
        // Taking input:
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader read a line as a string: buf.getLine() and throw IOE exception
        String name = buf.readLine();
        // to convert to another datatype: Datatype.parseDatatype(buf.getLine())
        // BufferedReader is faster than Scanner

        Scanner sc = new Scanner(System.in); // scannerName.nextDatatype
        String address = sc.next(); // read a single word
        int age = sc.nextInt();
        float gpa = sc.nextFloat();
        // when read smth not is String before, then if u want read a String
        // u must add one more "nextLine()" to read '\n'

        // Output:
        System.out.println("name: " + name); // print + endl
        System.out.println("add : " + address);
        System.out.println("age : " + age);
        System.out.printf("gpa : %.2f", gpa); // formated print
        sc.close();
    }
}
