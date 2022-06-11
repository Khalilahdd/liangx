package src.user.dao;

//计算各科平均分
public class Practice13 {
    public static void main(String[] args) {
        int[][] scores = {
                {82,90,91},
                {68,72,64},
                {95,91,89},
                {67,52,60},
                {79,81,85},
        };
        //TODO
        int sum = 0;
        int count = 0;
        //for each 遍历数组是一行一行遍历的
        for(int arr[]:scores)
        {
            for(int n:arr)
            {
                sum += n;
                count++;
            }
        }
        double avarage = (double)sum/count;
        System.out.println(avarage);
        if(Math.abs(avarage - 77.733333) < 0.000001){
            System.out.println("测试成功");
        }else{
            System.out.println("测试失败");
        }

    }
}
