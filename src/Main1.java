import java.util.Arrays;

public class Main1 {
    private static int[] numbers = {5, 3, 20,5,5,6,30,56, 56,28, 55,1, 4, 5, 0};

    public static void main(String[] args) {
        System.out.println("Długość tablicy: " + numbers.length);

        System.out.println(findNumber(numbers, 5));
    }

    public static int findNumber(int[] arr, int number) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return Arrays.binarySearch(arr, number);
    }
}
