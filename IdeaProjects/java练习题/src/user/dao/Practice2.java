package src.user.dao;

//判断指定年龄是否是小学生
public class Practice2 {
    public static void main(String[] args) {
        int age = 7;
        //primary student的定义：6~12岁
        boolean isPrimaryStudent = age >= 6 && age <= 12;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}
