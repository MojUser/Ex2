import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < 6 ; i++) {
            System.out.println("Podaj następną liczbę: ");
            numbers[i]= scanner.nextInt();
        }

        Random random = new Random();
        int firstRandomNumber = random.nextInt(101);
        int secondRandomNumber = random.nextInt(101);
        Arrays.sort(numbers);

        int indexOfFirstNumber = Arrays.binarySearch(numbers, firstRandomNumber);
        int indexOfSecondNumber = Arrays.binarySearch(numbers, secondRandomNumber);

        if(indexOfFirstNumber >= 0 && indexOfSecondNumber >= 0 ){
            System.out.println("Gratulacje Wygrałeś!");
        } else {
            System.out.println("Niestety, próbuj dalej!");
        }
    }
}
