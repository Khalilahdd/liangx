//字符串的连接
public class string {
    public static void main(String[] args) {
        //String类型的字符串可以直接进行连接
       /* String s1 = "Hello";
        String s2 = "world";
        String s = s1 + " " + s2 + "!";
        System.out.println(s);*/
       //如果用+连接字符串和其他数据类型，会将其他数据类型先自动转换为字符串，再进行连接
       int age = 25;
       String s = "age is " + age;
        System.out.println(s);
    }
}
