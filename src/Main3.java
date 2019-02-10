import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,5,5,5,5,6};
        System.out.println(getLastIndexOf(a,5));
        System.out.println(getLastIndexOfRev(a,5));


    }

    public static int getLastIndexOf(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
            }
        }
        return index;
    }

    public static int getLastIndexOfRev(int[] arr, int number) {
        for (int i = arr.length-1; i >= 0; i--){
            if(arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
