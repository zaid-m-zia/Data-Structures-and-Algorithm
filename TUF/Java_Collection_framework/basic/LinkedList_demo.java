
import java.util.*;

public class LinkedList_demo {
    public static void main(String[] args) {
        Queue <Integer> list = new PriorityQueue<>();
        list.push(3);
        list.push(5);
        list.push(6);
        System.out.println(list);
    // try{
        // list.get(2);       does not show output without a print statement   

    // }catch(Exception e){
    //     System.out.println(e);
    // }

    // list.set(0, 1000);      shows output without print statement
    list.pop();
    System.out.println(list);
    System.out.println(list.peek());

    }
}
