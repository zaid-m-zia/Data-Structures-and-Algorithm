
import java.util.HashMap;
public class frequency_counting {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,2,2};
        HashMap <Integer,Integer> freq = new HashMap<>();

        // for(int num : nums){
        //     freq.put(num,freq.getOrDefault(num,0)+1);
        // }
        // System.out.println(freq);

        // or this way too to avoid getordefault
        for(int num:nums){
            if(freq.containsKey(num)){
                freq.put(num,freq.get(num)+1);
            }
            else{
                freq.put(num,1);
            }


        }
        System.out.println(freq);

    }
}
