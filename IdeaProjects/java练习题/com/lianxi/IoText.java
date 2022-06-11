package com.lianxi;

import java.io.*;

public class IoText {

    public static void main(String[] args) {
        File filein = new File("D:\\test.txt");
        File fileout = new File("D:\\my.txt");

        try {
            FileInputStream fis = new FileInputStream(filein);
            FileOutputStream fos = new FileOutputStream(fileout);

            InputStreamReader in = new InputStreamReader(fis);
            OutputStreamWriter os = new OutputStreamWriter(fos);

            int len = 0;
            while ((len = in.read()) != -1) {
                os.write(len);
            }
            in.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
