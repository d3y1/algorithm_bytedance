package simple;

import java.util.Scanner;

/**
 * ZJ19 万万没想到之抓捕孔连顺
 * @author d3y1
 */
public class ZJ19{
    private static final int MOD = 99997867;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution(in);
        }
    }

    /**
     * 双指针
     *
     * 固1选2:
     * 依次固定最右边1个数(right),然后从该固定数前面剩余数中(left到right)选择2个
     *
     * @param in
     */
    private static void solution(Scanner in){
        int n = in.nextInt();
        int d = in.nextInt();

        int[] locs = new int[n];
        for(int i=0; i<n; i++){
            locs[i] = in.nextInt();
        }

        long result = 0;
        long gap;
        for(int left=0,right=0; right<n;){
            if(locs[right]-locs[left] > d){
                left++;
            }else{
                gap = right-left;
                if(gap >= 2){
                    result += gap*(gap-1)/2;
                    result %= MOD;
                }
                right++;
            }
        }

        System.out.println(result);
    }
}