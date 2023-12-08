package middle;

import java.util.Scanner;

/**
 * ZJ1 附加题(房间传送门)
 * @author d3y1
 */
public class ZJ1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution(in);
        }
    }

    /**
     * 动态规划
     * dp[i]: 第一次到达i房间的移动次数
     *
     *         {   0                                i=1
     * dp[i] = {   dp[i-1]+2                        i>1,pi[i-1]=i-1
     *         {   dp[i-1]+(dp[i-1]-dp[pi[i-1]])+2  i>1,pi[i-1]<i-1
     *
     * @param in
     */
    private static void solution(Scanner in){
        int n = in.nextInt();
        int[] pi = new int[n+1];
        for(int i=1; i<=n; i++){
            pi[i] = in.nextInt();
        }

        long[] dp = new long[n+2];
        long mod = (long)(1e9+7);

        // 初始化
        dp[1] = 0;

        for(int i=2; i<=n+1; i++){
            if(pi[i-1] == i-1){
                dp[i] = dp[i-1]+2;
            }else if(pi[i-1] < i-1){
                dp[i] = dp[i-1]+(dp[i-1]-dp[pi[i-1]])+2;
            }
            dp[i] %= mod;
        }

        System.out.println(dp[n+1]<0?dp[n+1]+mod:dp[n+1]);
    }
}