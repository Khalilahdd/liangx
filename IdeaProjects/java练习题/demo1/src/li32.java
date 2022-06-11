package demo1.src;
/**将第一个元素保存，对除第一个后面的元素进行处理，然后再进行加上第一个元素就可以了*/
public class li32 {
    public static String f(String s){
        if(s == null || s.length() < 2)
            return s;//如果这个字符串等于空串，或者该串的长度为1，就直接输出该串
        //if(s.length() <= 1)
        //  return s;
        return f(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(f("abc"));
    }
}
