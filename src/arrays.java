import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        // Part 1.1
        String[] array = new String[]{"one", "two", "three"};
        int[] arr1 = {1, 2, 3, 4, 5};
        double[] arr2 = new double[2];
        System.out.println("Enter size of array");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum is " + sum);

        //1.2
        int arr3[] = new int[5];
        arr3[2] = 40;
        arr3[3] = 42;
        arr3[4] = 45;
        System.out.println("5th element value is " + arr3[4]);

        //1.3.1
        int arr4[] = {1, 2, 3, 4, 5};
        System.out.println("Array4:");
        for (int j = 0; j < arr4.length; j++) {
            System.out.print(arr4[j]+ " ");
        }
        System.out.println();
        //1.3.2
        int arr5[] = {3, 2, 8, 9, 4};
        System.out.println("Array5:");
        for (int value: arr5) {
            System.out.print(value + " ");
        }
        System.out.println();
        // 1.3.3
        int arr6[] = {25, 3, 8};
        int value = 0;
        System.out.println("Array6:");
        while (value < arr6.length){
            System.out.print(arr6[value] + " ");
            value++;
        }

    }
}
