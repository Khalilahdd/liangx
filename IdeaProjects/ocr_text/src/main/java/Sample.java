import com.baidu.aip.nlp.AipNlp;
import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;

import java.util.HashMap;

public class Sample {
    //设置APPID/AK/SK
    public static final String APP_ID = "25270025";
    public static final String API_KEY = "fXWIGGFljxDb0prVIePlU8tG";
    public static final String SECRET_KEY = "gK5Gn22aDXzUgRHATS8hdynE01cNea7I";

    public static void main(String[] args) {
        // 初始化一个AipOcr
//        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
//
//        // 可选：设置网络连接参数
//        client.setConnectionTimeoutInMillis(2000);
//        client.setSocketTimeoutInMillis(60000);
//
//        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
////        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
////        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理
//
//        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
//        // 也可以直接通过jvm启动参数设置此环境变量
//        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
//
//        // 调用接口
//        String path = "E:\\Users\\Khalilah\\IdeaProjects\\ocr_text\\src\\hello.jpg";
//        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
//        System.out.println(res.toString(2));
//
//    }

        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 调用接口
//        String text = "百度是一家高科技公司";
//        JSONObject res = client.lexer(text, null);
//        System.out.println(res.toString(2));
        // 传入可选参数调用接口
        String text1 = "一位诚实的人";
        String text2 = "一位诚实的人";

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();
        options.put("model", "CNN");

        // 短文本相似度
        JSONObject res = client.simnet(text1, text2, options);
        System.out.println(res.toString(2));
    }
}