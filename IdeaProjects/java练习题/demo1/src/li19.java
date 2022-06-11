package demo1.src;
/**
 * 【程序23】
 * 题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，
 * 他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，
 * 说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？
 */
public class li19 {
    public static void main(String[] args) {
        int ageNum = getAge(5);
        System.out.println("第五个人的年龄：" + ageNum);
    }
    /**
     * 获取年龄
     * @param num
     * @return
     */
    private static int getAge(int num) {
        if(num == 1){
            return 10;
        }else {
            return getAge(num - 1) + 2;
        }
    }
}
