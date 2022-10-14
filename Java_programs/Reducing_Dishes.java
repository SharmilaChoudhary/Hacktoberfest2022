
import java.util.*;
public class Reducing_Dishes {
    
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
            int max=0; 
            for(int i=0;i<s.length;i++){
          int sum=0;
                int k=1;
                 for(int j=i;j<s.length;j++)
                 {sum= sum+ s[j]*(k);
                k++;}
         
             if(sum>max)
                 max=sum;
            }
             return max;
         }
}
