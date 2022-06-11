package com.atguigu.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class UploadServlet extends HttpServlet {

    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("文件上传过来了");
//        System.out.println(req.getParameter("username"));
//
//        ServletInputStream inputStream = req.getInputStream();
//
//        byte[] buffer = new byte[1024];
//        int read = inputStream.read(buffer);
//        System.out.println(new String(buffer,0,read));

        //1.先判断上传的数据是否是多段数据（只有是多段数据，才是文件上传的）

        if (ServletFileUpload.isMultipartContent(req)) {
            //创建FileItemFactory工厂实现类
            DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
            //创建用于解析上传数据的工具类ServletFileUpload
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            //解析上传的数据，得到每一个表单项FileItem
            try {
                //解析上传的数据，得到每一个表单项FileItem
                List<FileItem> list = servletFileUpload.parseRequest(req);

                for (FileItem fileItem: list) {

                    if (fileItem.isFormField()) {
                        //普通表单项

                        System.out.println("表单项的name属性值：" + fileItem.getFieldName());
                        System.out.println("表单项的value属性值:" + fileItem.getString("UTF-8"));
                    }else {
                        //上传的文件
                        System.out.println("表单项的name属性值：" + fileItem.getFieldName());
                        System.out.println("上传的文件名:" + fileItem.getName());

                        fileItem.write(new File("d:\\" + fileItem.getName()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
