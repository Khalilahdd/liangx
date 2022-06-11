package demo1.src;
/**
 * 【程序28】
 * 题目：求一个3*3矩阵对角线元素之和
 */
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class li22 {
    public static void main(String[] args) {
        //Random random = new Random();
        InputStream src;
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0;i < 3;i++) {
            for(int j = 0;j < 3;j++) {
                int num = scanner.nextInt();
                arr[i][j] = num;
                //arr[i][j] = random.nextInt(10);
            }
        }
        seekDiagonalSum(arr);
    }
    /**
     * 计算矩阵对角线之后
     * @param arr
     */
    private static void seekDiagonalSum(int[][] arr) {
        int slash = 0;
        int backSlach = 0;
        for(int i = 0;i < arr.length;i++){
            slash = slash + arr[i][i];
        }
        System.out.println("随机产生的3*3的矩阵为：");
        for(int i = 0;i < arr.length;i++) {
            for(int j = 0;j < arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
                if(i+j == arr.length - 1) {
                    backSlach += arr[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("正向对角线之和：" + slash);
        System.out.println("反向对角线之和：" + backSlach);
    }
}
