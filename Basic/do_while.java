import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<=size-1;i++){
            arr[i]=scanner.nextInt();
        }

        //now printing the array stored in the memory
        // int i = 0;
        // while(i<=size-1){
        //     System.out.println(arr[i]);
        //     i++;
        // }
        //for finding the sum traversing through the array
        // int i=0;
        // int sum=0;
        // while (i<=size-1) {
        //     sum+=arr[i];
        //     i++;
        // }
        // System.out.println(sum);
        
        //now the same thing using do while loop
        int i=0;
        do {
            System.out.println(arr[i]);
            i++;
        } while (i<=size-1);

    }
    
}
