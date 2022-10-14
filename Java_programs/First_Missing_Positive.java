//41. First Missing Positive leetcode
public class First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        int start=0;
          int end =nums.length;
        
          
          
          while(start<end){
              int correct=nums[start]-1;
          
              
              if(nums[start]>0 && nums[start]<end && nums[start]!=nums[correct]){
                  swap(nums,start,correct);}
              else{
                  start++;}}
          
          
      
          
          for(int i=0;i<end;i++){
             if(nums[i]!=i+1)
                 return i+1;
                 
              }
          return nums.length+1;
          }
  
      
      void swap(int[] nums,int start,int correct){
          int temp;
          temp=nums[correct];
          nums[correct]=nums[start];
          nums[start]=temp;
      }
}
