//溢出
public class Integer {
    public static void main(String[] args) {
        /*int x = 2147483640;
        int y = 15;
        int sum = x+y;//溢出不会报错但是会得到一个奇怪的结果*/
        //换long类型就不会发生溢出的现象，因为long的长度足够大
        long x = 2147483640;
        long y = 15;
        long sum = x + y;
        System.out.println(sum);
    }
}
