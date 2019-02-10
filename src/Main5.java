import java.util.Arrays;

public class Main5{
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("New Data");
        int intToTest = 1;

        System.out.println(stringBuilder);
        System.out.println(intToTest);

        test(intToTest);
        testObject(stringBuilder);

        System.out.println(stringBuilder);
        System.out.println(intToTest);

    }
    public static void test(int a){
        a += 1;
    }

    public static void testObject(StringBuilder a){
        a.append("Dog!");
    }

    public static boolean binaryContains(int[] arr, int number) {
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, number);

        return index >= 0;
    }
}
