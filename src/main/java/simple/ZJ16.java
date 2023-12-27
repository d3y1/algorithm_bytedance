package simple;

import java.util.Scanner;

/**
 * ZJ16 数列的和
 * @author d3y1
 */
public class ZJ16{
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
        double num = in.nextInt();
        int m = in.nextInt();

        double sum = 0;
        for(int i=1; i<=m; i++){
            sum += num;
            num = Math.sqrt(num);
        }

        System.out.printf("%.2f\n", sum);
    }
}