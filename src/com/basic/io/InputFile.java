package com.basic.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description 文件的读写+异常使用
 * @auther liudandan
 * @create 2019-11-20 12:04 下午
 */
class InputFileDemo {
    private BufferedReader in;
    InputFileDemo(String fname) throws Exception{
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e){
            System.out.println("Could not open "+fname);
            throw e;
        } catch (Exception e){
            try {
                in.close();
            } catch (IOException e1){
                System.out.println("in.close() fail ");
            }
            throw e;
        } finally {
            // Don't close it here!
        }
    }
    String getLine(){
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            System.out.println("readLine() fial ");
            s = "failed";
        }
        return s;
    }

    void cleanup(){
        try {
            in.close();
        } catch (IOException e) {
            System.out.println("in.cloes() fail ");
        }
    }
}

public class InputFile{
    public static void main(String[] args) {
        try {
            InputFileDemo in = new InputFileDemo("InputFile.java");
            String s;
            int i=1;
            while ((s = in.getLine()) != null)
                System.out.println(" "+ i++ +": " + s);
            in.cleanup();
        } catch (Exception e) {
            System.out.println("Caught in main , e.printStackTrace() ");
            e.printStackTrace();
        }

    }
}