package src.user.dao;

import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入上次考试的成绩：");
        //scanner.nextInt,如果是float型或者double型，就将后面的Int改成相应的类型就好了
        int lscore = scanner.nextInt();
        System.out.print("输入这次考试的成绩：");
        int pscore = scanner.nextInt();
        float increase = ((float)(pscore-lscore)/lscore)*100;
        System.out.printf("%.2f%%\n",increase);
    }
}
