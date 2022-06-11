package src.user.dao;

//自增和自减
public class Integer1 {
    public static void main(String[] args) {
        int n = 3300;
        n++;//相当于n = n + 1;
        n--;//相当于n = n - 1;
        //n++是先把n的值赋值给变量，再进行加1，而++n是先加1后再进行赋值
        int y = 100 + (++n);//虽然这样子写没错，但是尽量不要这样子写
        System.out.println(y);
    }
}
