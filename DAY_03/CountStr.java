import java.util.HashMap;

public class CountStr {
    public static void main(String[] args) {

        HashMap<Character,Integer> map = new HashMap<>();


        String s = "APPLE";

        for(char ch: s.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        System.out.println(map);
    }
}
