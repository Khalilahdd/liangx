package demo1.src;
/**求前20项的和*/
public class li17 {
    public static void main(String[] args) {
        double sumNum = sum(20);
        System.out.println("请20项规律谁之和为：" + sumNum);
    }
    /**
     * 前num的数的和
     * @param num
     */
    public static double sum(int num) {
        if(num == 1) {
            return 2.0/1.0;
        }else {
            double a = getMolecule(num);
            double b = getMolecule(num - 1);
            return sum(num - 1) + a/b;
        }
    }
    /**
     * 按规律获取分子
     * @param num
     * @return
     */
    public static double getMolecule(int num) {
        if(num == 1){
            return 2.0;
        }else if(num == 2){
            return 3.0;
        }else {
            return getMolecule(num - 1) + getMolecule(num - 2);
        }
    }

}
