package simple;

import java.util.Scanner;

/**
 * ZJ17 水仙花数
 * @author d3y1
 */
public class ZJ17{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution(in);
        }
    }

    /**
     * 模拟法
     * @param in
     */
    private static void solution(Scanner in){
        int min = in.nextInt();
        int max = in.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=min; i<=max; i++){
            if(isNarcissus(i)){
                sb.append(i).append(" ");
            }
        }

        if(sb.length() > 0){
            System.out.println(sb);
        }else{
            System.out.println("no");
        }
    }

    /**
     * 是否水仙花数
     * @param num
     * @return
     */
    private static boolean isNarcissus(int num){
        char[] digits = String.valueOf(num).toCharArray();
        if(num == Math.pow(Integer.parseInt(String.valueOf(digits[0])), 3)+Math.pow(Integer.parseInt(String.valueOf(digits[1])), 3)+Math.pow(Integer.parseInt(String.valueOf(digits[2])), 3)){
            return true;
        }

        return false;
    }
}