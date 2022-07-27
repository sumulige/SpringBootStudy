package com.example.springbootstudy.md5;

import java.security.MessageDigest;

public class Test {
    public static void main(String[] args) {
        String password = "Asdfgh@123";
        String md51 = md5(password.getBytes());
        String pwd = md5((md51 + "IgtUdEQJyVevaCxQnY").getBytes());
        System.out.println(pwd);
    }

    /**
     * MD5方法
     *
     * @param source
     * @return
     */
    public static String md5(byte[] source) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(source);
            StringBuffer buf = new StringBuffer();
            for (byte b : md.digest()) {
                buf.append(String.format("%02x", b & 0xff));
            }
            return buf.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
