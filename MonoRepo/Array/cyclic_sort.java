import java.util.Arrays;


// -----------------------------Important Note Below----------------------------

// NOTE : Cyclic sort can only be applied if the given array has numbers from range 1 to N and no number in between is missing

public class cyclic_sort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void cyclic(int arr[]){
        int i=0;
        while(i<arr.length){
            if(arr[i]-1==i){
                i++;
            }
            else{
                int ind=arr[i]-1;
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
            }

        }

    }
}
