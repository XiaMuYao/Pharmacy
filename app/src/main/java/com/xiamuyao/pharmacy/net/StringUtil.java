package com.xiamuyao.pharmacy.net;

import java.security.MessageDigest;
import java.sql.Time;

/**
 * ================================================
 * 作    者：夏沐尧  Github地址：https://github.com/XiaMuYaoDQX
 * 版    本：1.0
 * 创建日期： 2018/12/18
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class StringUtil {
    public static String getPasswor(String userNmae, String time) {
        byte[] bytes = toUnicodeMC(userNmae + time);
        String s = toMD5Code(bytes);
        return s + "-" + time;
    }

    public static String getToken() {
        String appid = "dtjfdafoenfkdla";
        String AppSecret = "7594932r9hfuhfh93yfihsaiuf329ufhkdshfw";
//        String Timestamp = String.valueOf(System.currentTimeMillis()).substring(0,10);
        String Timestamp = "1328025600";

        byte[] bytes = toUnicodeMC(AppSecret + Timestamp);
        String s = toMD5Code(bytes);
        return appid + "-" + s + "-" + Timestamp;
    }

    public static byte[] toUnicodeMC(String s) {
        byte[] bytes = new byte[s.length() * 2];
        for (int i = 0; i < s.length(); i++) {
            int code = s.charAt(i) & 0xffff;
            bytes[i * 2] = (byte) (code & 0x00ff);
            bytes[i * 2 + 1] = (byte) (code >> 8);
        }
        return bytes;
    }

    public static String toMD5Code(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(bytes);
            byte[] after = md5.digest();

            for (int i = 0; i < after.length; i++) {
                String hex = Integer.toHexString(0xff & after[i]);
                sb.append(hex);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(getPasswor("123456", "1538065485129"));
    }
}
