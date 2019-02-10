public class Main2 {
    public static void main(String[] args) {
//        int[] ints = new int[]{1,2,3,5,4,6,7,9};
//        System.out.println(getFistIndexOf(ints, 10));
//        System.out.println(getFirstIndexOfRecurrent(ints, 10,0));

    }

    public static int getFistIndexOf(int[] arr, int number) {
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int getFirstIndexOfRecurrent(int[] arr, int number, int index){
        if(index >= arr.length) {
            return -1;
        }
        if(arr[index] == number) {
            return index;
        }
        return getFirstIndexOfRecurrent(arr, number, index);
    }

}
