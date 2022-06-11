package com.exception.demo01;

public class Test {

    public static void main(String[] args) {

        new Test().test(1,0);
        int a = 1;
        int b = 0;
        //假设要捕获多个异常，从小到大
        try{    //try监控区域
            //new Test().a();
            if(b == 0){//主动的抛出异常 throw  throws
                throw new ArithmeticException();//主动的抛出异常
            }
            System.out.println(a / b);
        }catch(Error e) {//catch 捕获异常
            System.out.println("Error");
        }catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable t){
            System.out.println("Throwable");
        }
        finally {//处理后序工作
            System.out.println("finally");
        }

        //finally 可以不写finally
    }
    //假设这个方法中，处理不了这个异常，方法上抛出异常
    public void test(int a,int b){
        if(b == 0){//主动的抛出异常 throw  throws
            throw new ArithmeticException();//主动的抛出异常，一般在方法中使用
        }
        System.out.println(a / b);
    }





//    public void a(){
//        b();
//    }
//    public void  b(){
//        a();
//    }
}
