
package hard2;

public class Hard2 {

    public static void main(String[] args) {
        int nums1[]={3,5,7};
        int nums2[]={4,6,8};
      
        int l1=nums1.length;
        int l2=nums2.length;
        
        
        int nums3[]=new int [l1+l2];
        int array3=nums3.length;
        
        for(int i=0; i<l1; i++){
            nums3[i]=nums1[i];
        }
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
            System.out.println(abg);
        }
     
    }
    
}
