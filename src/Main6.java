public class Main6 {

    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,6,7,8,10};
        System.out.println(binarySearch(test, 7));
    }

    public static int binarySearch(int[] arr, int number) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

