import java.io.*;
import java.util.*;
public class Minmax{
    public static void solve(int[] nums, int n){
        int min = nums[0];
        int max = nums[0];
        
        for(int i=0;i<n;++i){ // This for loop iterates over the array. The minimum and maximum element finally gets stored at the 
            if(min>nums[i]){  // end of the loop. 
                min = nums[i];
            }
            
            if(max<nums[i]){
                max = nums[i];
            }
        }
        System.out.print("min = " + min + "," + " max = " + max);
    }
    
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;++i){
            nums[i] = sc.nextInt();
        }
        solve(nums,n);
        
    }
}