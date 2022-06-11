//import com.baidu.aip.http.HttpMethodName;
import com.baidubce.http.HttpMethodName;
import com.baidubce.http.ApiExplorerClient;
import com.baidubce.model.ApiExplorerRequest;
import com.baidubce.model.ApiExplorerResponse;

    // 短文本相似度 示例代码
    public class RequestDemo {

        //设置APPID/AK/SK
        public static final String APP_ID = "25270025";
        public static final String API_KEY = "fXWIGGFljxDb0prVIePlU8tG";
        public static final String SECRET_KEY = "gK5Gn22aDXzUgRHATS8hdynE01cNea7I";
        public static void main(String[] args) {
            String path = "https://aip.baidubce.com/rpc/2.0/nlp/v2/simnet";
            ApiExplorerRequest request = new ApiExplorerRequest(HttpMethodName.POST, path);


            // 设置header参数
            request.addHeaderParameter("Content-Type", "application/json;charset=UTF-8");



            // 设置jsonBody参数
            String jsonBody = "{\"text_1\": \"\\u6D59\\u5BCC\\u80A1\\u4EFD\", \"text_2\": \"\\u4E07\\u4E8B\\u901A\\u81EA\\u8003\\u7F51\"}";
            request.setJsonBody(jsonBody);

            ApiExplorerClient client = new ApiExplorerClient();

            try {
                ApiExplorerResponse response = client.sendRequest(request);
                // 返回结果格式为Json字符串
                System.out.println(response.getResult());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }