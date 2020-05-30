
import java.util.Arrays;


public class Task2_5 {
    public static void main(String[] args) {

        int[] result = mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3});

        System.out.println(Arrays.toString(result));;

    }



        public static int[] mergeArrays(int[] a1, int[] a2)
    {
        int[] result = new int [a1.length + a2.length];

        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        Arrays.sort(result);
        return result;
    }

}


