package threshold;

import java.util.Scanner;

/**
 * ZJ23 找零
 * @author d3y1
 */
public class ZJ23{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution(in);
        }
    }

    /**
     * 模拟法
     */
    private static void solution(Scanner in){
        int pay = in.nextInt();

        int money = 1024-pay;

        int result = 0;
        result += money/64;
        money %= 64;

        result += money/16;
        money %= 16;

        result += money/4;
        money %= 4;

        result += money/1;

        System.out.println(result);
    }
}