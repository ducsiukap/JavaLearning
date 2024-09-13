import java.util.ArrayList;
import java.util.Arrays; // for Arrays class

public class _05_Arrays {
    public static void main(String[] args) {
        // 1D ARRAYS
        // syntax: datatype[] arrayName = new datatype[number of element]{init value}
        int[] iArr = new int[] { 13, 3, 2004, 5, 7, 2006 };

        // MULTIPLE DIMENSIONS ARRAY
        // int[][] iArr2 = new int[3][3];

        // Accessing by index
        System.out.print("Accessing iArr[] by index: ");
        for (int i = 0; i < iArr.length; ++i)
            System.out.printf("%d ", iArr[i]);
        System.out.println();
        // using for each
        System.out.print("Accessing iArr[] using for-each loop: ");
        for (int item : iArr)
            System.out.printf("%d ", item);
        /*
         * Note:
         * - arrayName hold array's location in memory
         * ex: a = 0x0032 ([])
         * then b = a -> b = 0x0032 ([])
         * -> any change in b[] will be effected to a[]
         * ex:
         */
        System.out.println("\n");
        int[] iArr3 = iArr;
        System.out.print("iArr3: ");
        for (int item : iArr3)
            System.out.printf("%d ", item);
        System.out.println();

        System.out.println("iArr3[0] = -1");
        iArr3[0] = -1;
        System.out.print("iArr: ");
        for (int item : iArr)
            System.out.printf("%d ", item);
        System.out.println();
        /*-> to avoid: b = a.clone() // a copy of a[]*/
        // int[] iArr3 = iArr.clone()

        // Array Class in Java
        // syntax: Array.methodName(array[])
        System.out.print("\nArray.sort(iArr) : ");
        Arrays.sort(iArr);
        for (int item : iArr)
            System.out.printf("%d ", item);
        /*
         * OTHER METHOD:
         * - .binarySearch(arr, [start], [stop], key, [comparator])
         * - .compare(arr1, arr2)
         * - .copyOf(arr, newLength)
         * - .copyOfRange(arr, start, stop)
         * - .fill(arr, fillValue)
         * - equals(arr1, arr2)
         * - hashCode(arr)
         * - mismatch(arr1, arr2) // index of first unmatched between 2 array
         * - sort(arr, [start], [stop], [Comparator])
         * - setAll(arr, generationMethod(y
         */

        // ArrayList<class>(size)
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        arr.add(0, 2);
        /*
         * ArrayList method()
         * - .add([idx], item)
         * - .clear()
         * - .clone()
         * - .contain() -> boolean
         * - .get(idx) / set(idx, newValue)
         * - .indexOf() / lastIndexOf()
         * - .isEmpty()
         * - .remove(idx or obj)
         * - .size()
         * - .subList()
         * - .toArray()
         */
    }
}
