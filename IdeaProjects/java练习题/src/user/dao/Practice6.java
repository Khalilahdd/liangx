package src.user.dao;

import java.util.Scanner;
public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入(1--石头，2--剪刀，3--布):");
        int p = scanner.nextInt();
        int c = 1 + (int)(Math.random()*3);
        switch(p)
        {
            case 1 :
                System.out.print("你出的是石头！");
                if(c == 1)
                {
                    System.out.println("电脑出的是石头！\nDrow！");
                }
                else if(c == 2)
                {
                    System.out.println("电脑出的是剪刀！\nYou are win!");
                }
                else if(c == 3)
                {
                    System.out.println("电脑出的是布！\nYou are lose!");
                }
                break;
            case 2 :
                System.out.print("你出的是剪刀！");
                if(c == 1)
                {
                    System.out.println("电脑出的是石头！\nYou are lose!");
                }
                else if(c == 2)
                {
                    System.out.println("电脑出的是剪刀！\nDrow!");
                }
                else if(c == 3)
                {
                    System.out.println("电脑出的是布！\nYou are win!");
                }
                break;
            case 3 :
                System.out.print("你出的是布！");
                if(c == 1)
                {
                    System.out.println("电脑出的是石头！\nYou are win!");
                }
                else if(c == 2)
                {
                    System.out.println("电脑出的是剪刀！\nYou are lose!");
                }
                else if(c == 3)
                {
                    System.out.println("电脑出的是布！\nDrow!");
                }
                break;
            default:
            {
                System.out.println("错误！请输入1~3之间的数字！");
            }
        }
    }
}
