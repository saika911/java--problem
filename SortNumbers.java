import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        Arrays.sort(numbers);
        
        System.out.println("Sorted numbers in ascending order: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        scanner.close();
    }
}