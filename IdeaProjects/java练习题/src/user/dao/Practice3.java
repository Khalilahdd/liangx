package src.user.dao;

public class Practice3 {
    public static void main(String[] args) {
        //请将一组int值视为字符的unicode编码，然后将它们拼成一个字符串：
        int a = 72;
        int b = 105;
        int c = 65281;
       /* char a1 = '\u0048';
        char b1 = '\u0069';
        char c1 = '\uff01';*/
        String s = "" + (char)a +(char)b + (char)c;
        System.out.println(s);
    }
}
