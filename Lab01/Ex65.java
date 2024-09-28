//exercise 6.5
import java.util.Arrays;
import java.util.Scanner;

public class Ex65 {

        public static int calculateSum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }
    
        public static double calculateAverage(int[] array) {
            int sum = calculateSum(array);
            return (double) sum / array.length;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
    
            int[] array = new int[size];
    
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
    
            Arrays.sort(array);
    
            System.out.println("Sorted Array: " + Arrays.toString(array));
    
            int sum = calculateSum(array);
            System.out.println("Sum of array elements: " + sum);
    
            double average = calculateAverage(array);
            System.out.printf("Average value of array elements: %.2f\n", average);
    
            scanner.close();
        }
    }
    

