package src.user.action;

//短路运算
public class Bool {
    public static void main(String[] args) {
        boolean b = 5 < 3;//该语句显示b为false，又因为为&&运算，所以当第一个为false时，无论第二个是true和false，结果都是false
        //如果没有短路运算，&&后面的表达式会由于除数为0而报错，但实际上该语句并没有报错，是因为该运算是短路运算，提前计算出了结果
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);
    }
}
