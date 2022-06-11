public class Main2 {
    public static void main(String[] args) {
        int n = 100;//定义变量n，同时赋值为200
        System.out.println(n);//打印n的值
        n = 200;//变量n赋值为200
        System.out.println("n = " + n);//打印n的值
        int x = n;//变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("x = " + x);//打印x的值
        x = x + 100;//变量x赋值为x+100（x的值为200，因此赋值后的值为300）
        System.out.println("x = " + x);//打印x的值
        System.out.println("n = " + n);//再次打印n的值，n应该是200还是300？
    }
}
