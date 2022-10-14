
package leetcode;


public class Leetcode {

   

    public static void main(String[] args) {
        int nums1[]={3,5,7};
        int nums2[]={4,6,8,9};
      
        int l1=nums1.length;
        int l2=nums2.length;
        
        
        int nums3[]=new int [l1+l2];
        int array3=nums3.length;
        
        System.arraycopy(nums1, 0, nums3, 0, l1);
//         System.arraycopy(nums2, 0, nums3, l1+1, l2);
        
        
       for(int j=0; j<l2; j++){
          int temp=l1+j;
           nums3[temp]=nums2[j];
       }
        
        
          int mid =array3/2;
          int temp;

        for (int i = 0; i < nums3.length; i++) {
          for(int j=i+1; j<nums3.length; j++){
              if(nums3[i]>nums3[j]){
                  temp=nums3[i];
                  nums3[i]=nums3[j];
                  nums3[j]=temp;
              }
          }
        }
        System.out.println("length = "+array3);
        System.out.println("mid = "+mid);

       if(array3%2!=0){
           int result=nums3[mid];
           System.out.println(result);
       }
        else if(array3%2==0){
            double result=nums3[mid]+nums3[mid-1];
            double abg=result/2;
            System.out.println("Average  = "+abg);
        }
      
    }
    
}
