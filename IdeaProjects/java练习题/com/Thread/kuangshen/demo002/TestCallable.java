package com.Thread.kuangshen.demo002;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

//线程创建方式三：实现callable接口
/*
    callable的好处：
        1.可以定义返回值
        2.可以抛出异常
 */
public class TestCallable implements Callable<Boolean> {

    private String url;//网络图片地址
    private String name;//保存的文件名

    public TestCallable(String url,String name) {
        this.url = url;
        this.name = name;
    }

    //下载图片线程的执行体
    @Override
    public Boolean call() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为：" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E8%BF%AA%E4%B8%BD%E7%83%AD%E5%B7%B4&step_word=&hs=2&pn=6&spn=0&di=105490&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=1567337951%2C1657454693&os=1415905176%2C3071945957&simid=3448768393%2C360065024&adpicid=0&lpn=0&ln=1737&fr=&fmq=1611895825757_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201812%2F15%2F20181215185841_cXAjA.thumb.700_0.jpeg%26refer%3Dhttp%3A%2F%2Fb-ssl.duitang.com%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Djpeg%3Fsec%3D1614487834%26t%3D7f1dbf28d17566db1846fbf5a43c6e74&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bf5i7_z%26e3Bv54AzdH3FwAzdH3Fdba800d0l_8aaadbn88%3F_u%3Dtg1jx_rw2j6jv54_8mn&gsm=7&rpstart=0&rpnum=0&islist=&querylist=&force=undefined","1.jpg");
        TestCallable t2 = new TestCallable("https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E8%BF%AA%E4%B8%BD%E7%83%AD%E5%B7%B4&step_word=&hs=2&pn=8&spn=0&di=7920&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=3342226641%2C825437640&os=655217277%2C1465222756&simid=4128959224%2C627412815&adpicid=0&lpn=0&ln=1737&fr=&fmq=1611895825757_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201804%2F15%2F20180415191938_ufvFv.jpeg%26refer%3Dhttp%3A%2F%2Fb-ssl.duitang.com%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Djpeg%3Fsec%3D1614487834%26t%3D6f27b2008f763d7bd3f26792689b692d&fromurl=ippr_z2C%24qAzdH3FAzdH3Fptjkw_z%26e3Bkwt17_z%26e3Bv54AzdH3FrAzdH3Fcdm09b0d0c&gsm=7&rpstart=0&rpnum=0&islist=&querylist=&force=undefined","2.jpg");
        TestCallable t3 = new TestCallable("https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E8%BF%AA%E4%B8%BD%E7%83%AD%E5%B7%B4&step_word=&hs=2&pn=10&spn=0&di=181390&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=3161603678%2C3274132209&os=3650718755%2C397166132&simid=4028552982%2C588821957&adpicid=0&lpn=0&ln=1737&fr=&fmq=1611895825757_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201902%2F01%2F20190201121016_fbleb.jpg%26refer%3Dhttp%3A%2F%2Fb-ssl.duitang.com%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Djpeg%3Fsec%3D1614487834%26t%3D227a191b441bdbbb85a1348e5f55ee55&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3B17tpwg2_z%26e3Bv54AzdH3Fks52AzdH3F%3Ft1%3D8acd9n8all&gsm=7&rpstart=0&rpnum=0&islist=&querylist=&force=undefined","3.jpg");

//        new Thread(t1).start();
//        new Thread(t2).start();
//        new Thread(t3).start();

        //创建执行服务：
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);

        //获取结果
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);

        //关闭服务
        ser.shutdownNow();
    }
}


//下载器
class WebDownloader{
    //下载方法
    public void downloader(String url,String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}