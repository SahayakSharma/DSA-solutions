

public class produc_array_puzzle {
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    long allproduct=1;
	    long non=1;
	    int count=0;
	    long[] aray=new long[n];
	    for(int i=0;i<n;i++){
	        if(nums[i]==0){
	            count++;
	            
	        }
	        else{
	            non=non*nums[i];
	        }
	        allproduct=allproduct*nums[i];
	    }
	    for(int i=0;i<n;i++){
	        if(nums[i]==0){
	            if(count==1){
	                aray[i]=non;
	            }
	            else if(count>1){
	                aray[i]=0;
	            }
	        }
	        else{
	            aray[i]=allproduct/nums[i];
	        }
	    }
	    return aray;
	    
        // code here
	} 
}
