import java.util.HashMap;

public class CountFre{

    public static void main(String[] args) {
        
        int[] arr = {1,5,2,1,3};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){

            map.put(num,map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
    }
}