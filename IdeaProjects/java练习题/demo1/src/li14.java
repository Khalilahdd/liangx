package demo1.src;
/**题目：输出九九乘法表*/
public class li14 {
    public static void main(String[] args) {
        for(int i = 1;i <= 9;i++){
            for(int j = 1; j <= i;j++){
                System.out.println(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println("");
        }
    }
}
