package src.user.dao;

//for each循环对数组每个元素求和
public class Practice10 {
    public static void main(String[] args) {
        System.out.print("练习2：");
        int[] ns = new int[] {1,4,9,16,25};
        int sum = 0;
        for(int i = 0;i < ns.length;i++)
        {
            sum += ns[i];
        }
        System.out.println(sum);
    }
}
