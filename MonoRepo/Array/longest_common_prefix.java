package MonoRepo.Array;

public class longest_common_prefix {
    String longestCommonPrefix(String arr[], int n){
        int i=0;
        String result="";
        while(i!=arr[0].length()){
            try{
                char check=arr[0].charAt(i);
            int flip=0;
            for(int j=1;j<n;j++){
                if(arr[j].charAt(i)!=check){
                    flip++;
                    break;
                }
            }
            if(flip!=0){
                break;
            }
            result=result+check;
            i++;
            }
            catch(Exception e){
                break;
            }   
        }
        if(result==""){
            return "-1";
        }
        else{
            return result;
        }
        // code here
    }
    
}
