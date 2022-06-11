package demo1.src;
    /**递归*/
    public class li28 {
        public static void main(String[] args) {
            int[] a = {2,5,3,9,12,7};
            //int sum = f(a,0);
            //int sum = f(a,6);
            int sum = f(a,0,5);//a从第0项进行的累加值/a从第end-1项进行累加
            System.out.println(sum);
        }
        //begin+1~a.length的数组进行求和
        /*  public static int f(int[] a,int begin){
              if(begin == a.length)
                  return 0;
              int x = f(a,begin+1);
              return x + a[begin];
          }*/
        //a[0]~end - 1的数组进行求和
        /*public static int f(int[] a ,int end){
            if(end == -1)
                return  0;
            int x = f(a,end-1);
            return x + a[end];*/
        public static int f(int[] a,int begin,int end){
            if(begin == end)
                return a[begin];
           int mid = (begin+end)/2;
          if(mid == begin)
              return a[begin]+a[end];
           return f(a,begin,mid - 1) + f(a, mid,end);
        }
}
