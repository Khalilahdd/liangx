package demo1.src;
/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class li41 {
    public static void main(String[] args) {
        int x = 1;
        boolean flag = isPaliandrome(x);
        System.out.println(flag);
    }
/**
 * 判断x是否是回文数
 * @param x
 * @return
 */
public static boolean isPaliandrome(int x){
    if(x < 0){
        return false;
    }
    if(x < 10){
        return true;
    }
    int newi = 0;
    int num = x;
    while(true){
        if(newi > 0){
            newi = newi * 10;
        }
        int i = num % 10;
        newi = newi + i;
        num = num/10;
        if(num <= 9){
            newi = newi * 10 + num;
            break;
        }
    }
    if(newi == x){
        return true;
    }else{
        return false;
    }
    }
}
