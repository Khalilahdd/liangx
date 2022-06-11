package demo1.src;

import java.util.ArrayList;
import java.util.List;
/**
 * 阿拉伯数字转罗马数字，罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 */
public class li46 {
    public static void main(String[] args) {
        System.out.println(inToRoman(1994));
    }
    /**
     * 阿拉伯数字转罗马数字
     * @param num
     * @return
     */
    public static String inToRoman(int num){
        List<String>list = new ArrayList<>();
        StringBuilder results = new StringBuilder();
        int i = num;
        int num0 = 1;
        while(i > 0) {
            int temp = i % 10;
            if(num0 == 1) {
                if(temp == 4) {
                    list.add("IV");
                }else if(temp == 9) {
                    list.add("IX");
                }else {
                    list.add(AssembleNumber(temp,"X","L"));
                }
            }else if(num0 == 100){
                if(temp == 4){
                    list.add("CD");
                }else if(temp == 9) {
                    list.add("CM");
                }else {
                    list.add(AssembleNumber(temp,"C","D"));
                }
            }else {
                list.add(AssembleNumber(temp,"M",""));
            }
            num0 = num0 * 10;
            i = i / 10;
        }
        for(int index = list.size() - 1;index >= 0;index--){
            results.append(list.get(index));
        }
        return results.toString();
    }
    /**
     * 转化
     * @param temp
     * @param str0
     * @param str1
     * @return
     */
    public static String AssembleNumber(int temp,String str0,String str1){
        String result = " ";
        if(temp < 4) {
            for(int i = 1;i <= temp;i++) {
                result = result + str0;
            }
        }else {
            result = result + str1;
            for(int i = 1;i < temp - 5;i++){
                result = result + str0;
            }
        }
        return result;
    }
}
