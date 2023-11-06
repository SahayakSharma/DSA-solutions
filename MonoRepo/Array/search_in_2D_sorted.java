import java.util.*;
public class search_in_2D_sorted{
    public static void main(String[] args) {
        int [][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
            };
        

      
        System.out.println(Arrays.toString(search(arr,5)));
        
    }
    static int[] search(int [][]arr,int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            else if(arr[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}