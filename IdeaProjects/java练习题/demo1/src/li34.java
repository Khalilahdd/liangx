
package demo1.src;

import java.util.ArrayList;

/*public class li34 {
    //对它进行加法划分
    public static void f(int n,int[] a,int k){
        if(n <= 0){
            for(int i = 0;i < k;i++)
                System.out.print(a[i] + " ");
            System.out.println();
            return ;
        }
        for(int i = n;i >0;i--){
            if(k > 0 && i > a[k - 1])
                continue;
            a[k] = i;
            f(n - i,a,k+1);
        }
    }
    public static void main(String[] args) {
        int[] a = new int[10001];
        f(6,a,0);//n表示元素，a表示缓冲区，k表示当前位置
    }
}*/
public class li34{
    /**
     * sum：有错的和
     * a:明细
     * k：当前处理的位置
     * cur_sum:前边的元素累加和
     */
    public static void f(int err_sum ,int [] a,int k,int cur_sum,boolean[] b){
        if(cur_sum > err_sum)//如果前边元素的累加和大于用错的和，就直接返回
            return;
        //递归的顺序会导致结果出现错误，所以在考虑递归的时候要注意考虑的顺序
        if(err_sum == cur_sum){
            for(int i = 0;i < b.length;i++)
                if(b[i] == false)
                    System.out.print(i + " ");
            System.out.println();
            return ;
        }
        if(k >= a.length)//如果k大于数组a的长度，就直接返回
            return ;

        b[k] = false;
        f(err_sum,a,k+1,cur_sum,b);
        b[k] = true;
        cur_sum += a[k];
        f(err_sum,a,k+1,cur_sum,b);
        b[k] = false;//回溯！！！很重要
    }
    public static void main(String[] args) {
        int err_sum = 6;
        int[] a = {3,2,4,3,1};
        boolean[] b = new boolean[a.length];
        f(6,a,0,0,b);
    }
}
