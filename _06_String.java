import java.util.StringTokenizer;
import java.util.StringJoiner;

public class _06_String {
    public static void main(String[] args) {
//        String
        String name = "Pham Van Duc"; // immutable
        /* method:
        - .substr(i, [j])
        - .concat(String)
        - .equals(str) / equalsIgnoreCase(str)
        - .compareTo(str) / .compareToIgnoreCase(str)
        - .trim()
        - .replace(oldChar, newChar)
        - .toCharArray()
        - .isEmpty()
        - .split()
         */

//        StringBuffer Class
        System.out.println("StringBufferClass:");
        StringBuffer sb = new StringBuffer(name); //-> ArrayList<char>
        // method
        sb.append(" 2004."); //append at end
        // sb.insert(idx, str)
        System.out.println(sb);
        // sb.replace(st, en, str);
        // sb.delete(st, en)
        sb.reverse();
        System.out.println(sb);

//        StringTokenizer abc ss    a = "abc", "ss", "a"
        System.out.println("\nStringTokenizer Class:");
        /* syntax: new StringTokenizer(str, [delim], [flag])
        - delim is defaulted by " \t\n"
        - flag = true: delim is a token
        - flag = false: delim is not a token
         */
//        StringTokenizer st = new StringTokenizer(name);
//        System.out.println(st.countTokens());
//        while(st.hasMoreTokens())
//            System.out.println(st.nextToken());

        StringTokenizer st = new StringTokenizer("a+b=c", "+="/*delim*/, true/*flag*/);
        System.out.println(st.countTokens());
        while (st.hasMoreTokens())
            System.out.print(st.nextToken() + " ");
        System.out.println();


//        StringJoiner
        System.out.println("\nStringJoiner Class:");
        // syntax: StringJoiner(delim, [prefix], [suffix])
        StringJoiner sj = new StringJoiner(",", "..", "..");
        // if delim is null => throws NullPointer Exception
        // method:
        sj.setEmptyValue("empty");
        System.out.println(sj);
        sj.add("duc");
        sj.add("anh");
        System.out.println(sj);
        // sj.toString()

        StringJoiner sj2 = new StringJoiner(":");
        sj2.add("c++").add("java").add("python");

        sj.merge(sj2);
        System.out.println(sj.length());
        System.out.println(sj);

    }
}
