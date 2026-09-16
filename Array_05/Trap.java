public class Trap {
    public static int trapWater(int[] height){
        int n = height.length;
        int res = 0, l = 0, r = n-1;
        int lMax = height[l], rMax = height[r];

        while(l < r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            }else{
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trapWater(height));
    }
    
}
