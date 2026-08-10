import java.util.HashMap;

public class HighestFre {
    public static void main(String[] args) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int[] arr = {3,5,2,5,1,4};

        for (int i : arr) {
            map.put(i,map.getOrDefault(i, 0)+1);
        }

        int maxFre = 0;
        int answer = -1;

        for(int key:map.keySet()){
            if(map.get(key)>maxFre){

                maxFre=map.get(key);
                answer=key;
            }
        }
        System.out.println("Element which has Highest frequency : "+answer);
    }
}
