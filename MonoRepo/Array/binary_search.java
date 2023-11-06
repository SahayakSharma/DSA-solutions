public class binary_search {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5};
        int position=binary(arr,4);
        System.out.println(position);
        
    }

    static int binary(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid;

        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;


    }
}
