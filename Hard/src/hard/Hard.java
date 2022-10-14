
package hard;

public class Hard {

    
    public static void main(String[] args) {
       int nums1[]={1,2,4};
       int nums2[]={7,5,4,3};
       
        int l1=nums1.length;
        int l2=nums2.length;
        
        
        int nums3[]=new int [l1+l2];
        
        for(int i=0; i<l1; i++){
            nums3[i]=nums1[i];
        }
        for(int j=0; j<l2; j++){
            int temp=l1+j;
            nums3[temp]=nums2[j];
        }
        int min=nums3[0];
        int max=nums3[0];
        
        for(int i=0; i<nums3.length; i++){
            for(int j=i+1; j<nums3.length; j++){
                if(min>nums3[j]){
                    min=nums3[j];
                }
                if(max<nums3[j]){
                    max=nums3[j];
                }
            }
        }
        int sum=0, count=0;
        for (int i = min+1; i < max; i++) {
            count++;
            sum=sum+i;
        }
            double avg;
            avg=sum/count;
                    
        System.out.println("Average = "+avg);            
    }
    
}
