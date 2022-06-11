package src.user.dao;//使用do while 循环计算m到n的和
import java.util.Scanner;
public class Practice8 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("计算从m到n的和.\n");
        System.out.print("输入m的值：");
        int m = scanner.nextInt();
        System.out.print("输入n的值：");
        int n = scanner.nextInt();
        do {
            sum += m;
            m++;
        }while (m <= n);
        System.out.println(sum);
    }
}
