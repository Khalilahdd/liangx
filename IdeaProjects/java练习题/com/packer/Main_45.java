package com.packer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main_45 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try(ObjectOutputStream output = new ObjectOutputStream(buffer)) {
            //写入int:
            output.write(12345);
            //写入String:
            output.writeUTF("Hello");
            //写入Objer：
            output.writeObject(Double.valueOf(123.456));
        }
        System.out.println(Arrays.toString(buffer.toByteArray()));
    }
}
