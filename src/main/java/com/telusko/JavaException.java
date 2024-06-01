package com.telusko;

import com.telusko.Demo;

public class JavaException {
    public static void main(String[] args) {
        Demo obj = new Demo();
        try {
            obj.Alpha();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
