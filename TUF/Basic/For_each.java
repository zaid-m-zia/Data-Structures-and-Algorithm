import java.util.Scanner;

public class For_each {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        //storing the taken input in array
        for(int i=0;i<=size-1;i++){
            arr[i] = scanner.nextInt();
        }
        //now printing the array stored in the memory using for each
        for(int num:arr){
            System.out.println(num);
        }
        //the other way of iterating over the array is...for each loop without using an index
        int sum = 0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);


        scanner.close();
    }
    
}
