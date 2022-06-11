package demo1.src;
/**题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，
 * 请问该数是多少？
 */
public class li16 {
    public static void main(String[] args) {
        squareNum();
    }
    public static void squareNum() {
        int i = 1;
        while(true) {
            int temp = i * i;
            int z = 1;
            while (true) {
                if(z * z - temp >= 168) {
                    break;
                }
                z++;
            }
            if(z * z - i * i == 168 && (z * z - 168 - 100) >= 0) {
                System.out.println("一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，则该数为：" + (z * z - 168 - 100));
                break;
            }else {
                i++;
            }
        }
    }
}
