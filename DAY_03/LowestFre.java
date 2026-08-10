import java.util.HashMap;

public class LowestFre {
    public static void main(String[] args) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int[] arr = {4,5,2,1,4,5};

        for (int i : arr) {
            map.put(i,map.getOrDefault(i, 0)+1);
        }

        int minFre = Integer.MAX_VALUE;
        int answer = -1;

        for(int key:map.keySet()){
            if(map.get(key)<minFre){

                minFre=map.get(key);
                answer=key;
            }
        }
        System.out.println("Element which has lowest frequency : "+answer);
    }
}
