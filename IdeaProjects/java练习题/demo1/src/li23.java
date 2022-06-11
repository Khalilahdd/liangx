package demo1.src;
/**
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，
 * 十位与千位相同。
 */
import java.util.ArrayList;
import java.util.List;

public class li23 {
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int num = 12321;
        palindromeNebr(num);
        if(list.get(0) == list.get(4) && list.get(1) == list.get(3)) {
            System.out.println("数字(" + num + ")是回文数");
        }else {
            System.out.println("数字(" + num + ")不是回文数");
        }
        /**第二种方式*/
        char[] arr = (num+"").toCharArray();
        if (arr[0] == arr[4] && arr[1] == arr[3]){
            System.out.println("数字(" + num + ")是回文数");
        }else {
            System.out.println("数字(" + num + ")不是回文数");
        }
    }
    /**
     * 判断num是否是回文数
     * @param num
     */
    private static void palindromeNebr(int num) {
        int length = (num+"").length()-1;
        int numTemp = 0;
        if(num < 0){
            numTemp = num;
        }else {
            numTemp = num/(int)Math.pow(10,length);
            int tmp = num - numTemp*(int)Math.pow(10,length);
            palindromeNebr(tmp);
        }
        list.add(numTemp);
    }
}
