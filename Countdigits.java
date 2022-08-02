import java.util.*;
import java.io.*;
public class Countdigits {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>();
        String str = new String();
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int n = str.length(), k, count = 0;
        // int [] nums = new int[n];
        for(int i=0;i<n;i++){
            k = (int)str.charAt(i); // Here, explicit type casting from character to integer is done 
            if(48<=k && k<=57){
                v.add(str.charAt(i) - '0'); // Here, str.charAt(i) - '0' will convert the string number to integer number
            }
        }
        for(int i=0;i<v.size();i++){
            count = count + v.get(i);
        }
        System.out.println("No. of digits: " + v.size());
        System.out.println("Count of the digits: " + count);
    }
}
