package demo1.src;
/**杨辉三角m层的n个元素
 * 杨辉三角首先是要了解它的规律：
 * 就是后一行的值，等于前一行的两个进行相加
 */
/*public class li33 {
    public static int f(int m, int n) {
        if (n == 0)
            return 1;
        if (n == 0 || n == m)
            return 1;
        return f(m - 1, n) + f(m - 1, n - 1);
    }

    public static void main(String[] args) {
        //int level = 5;
        //for(int i = 0;i <= level;i++)
        System.out.println(f(5, 3) + " ");
        System.out.println();
    }
}*/
/**如果要m个一样的字符和n的一样的字符进行排序*/
public class li33{
    public static int f(int m,int n){
        if(m == 0 || n == 0)//当m或者n等于0，它只存在一个字符，那么它进行排列的是一样的，只有一种可能。
            return 1;
        return f(m - 1,n) + f(m,n - 1);
    }
    public static void main(String[] args) {
        System.out.println(f(3, 2));
    }
}
