import java.util.Arrays;

public class selection_sort {

    public static void main(String[] args) {

        int []arr={5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int maxele=findmax(arr,0,arr.length-i);

            swap(arr,maxele,arr.length-i-1);

        }
    }

    static int findmax(int arr[],int start,int end){
        int max=arr[start];
        int index=0;
        for(int i=start;i<end;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }

    static void swap(int arr[],int max,int last){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
    
}
