import java.util.Scanner;

public class MinMaxCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("The number of elements must be greater than 0.");
            return;
        }
        
        int[] numbers = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int min = findMin(numbers);
        int max = findMax(numbers);
        
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        
        scanner.close();
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}


