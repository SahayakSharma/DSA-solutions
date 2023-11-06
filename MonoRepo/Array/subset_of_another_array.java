// Status: Accepted

import java.util.ArrayList;

class subset_of_another_array {
    public String isSubset( long a1[], long a2[], long n, long m) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add((int)a1[i]);
        }
        
        
        for(int i=0;i<m;i++){
            if(!list.contains((int)a2[i])){
                return "No";
                
            }
            else{
                int x=(int)a2[i];
                list.remove(Integer.valueOf(x));
            }
        }
        return "Yes";
        
        
    }
}