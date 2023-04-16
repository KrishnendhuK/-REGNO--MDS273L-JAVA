
    import java.util.Arrays;
import java.util.Scanner;

public class lab_3{
    public static void main(String[] args){
        float mean;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the length of the array to see your output: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the arrays: ");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the array element: ");
            arr[i] = sc.nextInt(); 
        }
        
        // Calculate mean, median, and mode
        mean = getMean(arr);
        float median = getMedian(arr);
        int mode = getMode(arr);
        
        // Print the results
        System.out.println("The mean of the array is: " + mean);
        System.out.println("The median of the array is: " + median);
        System.out.println("The mode of the array is: " + mode);
    }
    
    public static float getMean(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        float mean = sum / (float)array.length;
        return mean;
    }
    
    public static float getMedian(int[] array){
        Arrays.sort(array);
        float median;
        if (array.length % 2 == 0) {
            int midIndex = array.length / 2;
            median = (array[midIndex - 1] + array[midIndex]) / 2.0f;
        } else {
            int midIndex = array.length / 2;
            median = array[midIndex];
        }
        return median;
    }
    
    public static int getMode(int[] array){
        Arrays.sort(array);
        int mode = array[0];
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = array[i - 1];
                }
                currentCount = 1;
            }
        }
        if (currentCount > maxCount) {
            mode = array[array.length - 1];
        }
        return mode;
    }}


