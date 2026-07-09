
import java.util.*;

public class LinkedList_demo {
    public static void main(String[] args) {
        List <Integer> list = new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list);
    // try{
        // list.get(2);       does not show output without a print statement   

    // }catch(Exception e){
    //     System.out.println(e);
    // }

    // list.set(0, 1000);      shows output without print statement
        for(int nums:list){
            System.out.println(nums);
        }
    System.out.println(list);

    }
}
