package com.packer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main_43 {
    public static void main(String[] args)throws IOException {
        byte[] data;
        try(ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            System.out.write("Hello ".getBytes("UTF-8"));
            System.out.write("world!".getBytes("UTF-8"));
            data = output.toByteArray();
        }
        System.out.println(new String(data, "UTF-8"));
    }
}
