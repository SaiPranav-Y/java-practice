// Leetcode Decodeways problem
public class Decodeways {
    public int numCodings(String s){
        int i=0;
        if(s.charAt(i)=='0')
        return 0;       
        for(i=0;i<s.length();++i){
            if(i-1>=0 && s.charAt(i)==0 &&  (s.charAt(i-1))!='1' ||  s.charAt(i-1)!='2'){
                return 0;
            }
        int dp[] = new int[s.length()];
        dp[0] = 1;
        int val = Integer.parseInt(s.substring(0,2));
        if(val==10 || val==20 || val>26){
            dp[1] = 1;
        }
        else{
            dp[1] = 2;
        }
        //for(int i=2;i<)7
        }
        return 0;
    }
}
