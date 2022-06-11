package src.user.action;

//三元运算符
public class Bool1 {
    public static void main(String[] args) {
        int n = -100;
        // n >= 0 判断这个条件成立不，然后成立则输出n，否则输出-n
        int x = n >= 0 ? n : -n;
        System.out.println(x);
    }
}
