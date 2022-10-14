//164. Maximum Gap leetcoe
import java.util.*;
class Maximum_Gap{
    public int maximumGap(int[] nums) {
        int max1=0;
            Arrays.sort(nums);
          if(nums.length==1){
              return 0;}
            
            for(int i=0;i<nums.length-1;i++) {
              
                max1=Math.max(nums[i+1]-nums[i],max1);     
          } 
            
         return max1;   
            
        }
}