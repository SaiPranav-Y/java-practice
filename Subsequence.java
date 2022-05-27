public class Subsequence {
 public static void main(String[] args){
     String str = "asqfhcghaoith";
     String chk = "cat";
    int j = 0;
    int len = str.length();
    int clen = chk.length();
    for(int i=0;i<len;i++){
        if(j<clen && str.charAt(i)==chk.charAt(j)){ // Here j<clen will prevent j incrementing continously and stops it after entire subsequence is checked
            j++;
        }
    }

    if(clen == j){
        System.out.println("Subsequence exists");
    }
    else{
        System.out.println("Subsequence does not exist");
    }
 }
}
