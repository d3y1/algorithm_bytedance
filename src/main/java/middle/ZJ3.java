package middle;

import java.util.Scanner;

/**
 * ZJ3 编程题2(字符转换)
 * @author d3y1
 */
public class ZJ3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution(in);
        }
    }

    /**
     * 滑动窗口
     */
    private static void solution(Scanner in){
        int n = in.nextInt();
        int m = in.nextInt();
        String s = in.next();

        int countA = 0;
        int countB = 0;
        int max = 0;
        for(int left=0, right=0; left<=right&&right<n;){
            if(Math.min(countA, countB) <= m){
                max = Math.max(max, right-left);

                if(s.charAt(right++) == 'a'){
                    countA++;
                }else{
                    countB++;
                }
            }else{
                if(s.charAt(left++) == 'a'){
                    countA--;
                }else{
                    countB--;
                }
            }
        }

        System.out.println(max);
    }
}