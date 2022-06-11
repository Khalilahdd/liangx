package src.user.dao;//判断人的BMI指数，是否肥胖
import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入体重(kg)：");
        float weight = scanner.nextFloat();
        System.out.print("输入身高(cm)：");
        float height = scanner.nextFloat();
        float bmi = weight/(height*height);
        if(bmi >= 32)
        {
            System.out.println("非常肥胖");
        }
        else if(bmi >= 28 && bmi < 32)
        {
            System.out.println("肥胖");
        }
        else if(bmi >= 25 && bmi < 28)
        {
            System.out.println("过重");
        }
        else if(bmi >=18.5 && bmi < 25)
        {
            System.out.println("正常");
        }
        else
        {
            System.out.println("过轻");
        }
    }
}
