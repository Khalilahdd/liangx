package src.user.action;

//数组赋值改变
public class array2 {
    public static void main(String[] args) {
        String[] names = {"ABC","XYZ","zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s);
    }
}
