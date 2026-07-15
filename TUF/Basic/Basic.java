//q- take input of size and the array inputs and print the sum of all the numbers in the array

import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        //storing the taken input in array
        for(int i=0;i<=size-1;i++){
            arr[i] = scanner.nextInt();
        }

        //printing the array made
        int sum = 0;
        for(int j=0;j<=size-1;j++){
            sum += arr[j];
        }
        System.out.println(sum);
        scanner.close();
    }

}
