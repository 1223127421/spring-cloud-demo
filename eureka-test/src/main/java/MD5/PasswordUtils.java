package MD5;

import java.security.MessageDigest;

/**
 * @Author: wangzhuyi
 * @Date: 2019/3/26 10:54
 * @Version 1.0
 * @Describe
 */
public class PasswordUtils {

    public static final String PW_SECURITY_KEY = "929123f8f16454e8b0a531045453e1f1";

    public static void main(String[] args) {
        String password = encrypt("admin", "123456");
        System.out.println("加密后的password:" + password);
        String password2 = decrypt("admin", "TKvRGsfEjja07C2lkmpBmg==");
        System.out.println("解密后的password2:" + password2);
    }

    /**
     * AES 加密
     *
     * @param username
     * @param password 未加密的密码
     *                 盐值，默认使用用户名就可
     * @return 加密后的密码
     * @throws Exception
     */
    public static String encrypt(String username, String password) {
        return AesUtils.encrypt(MD5(username + PW_SECURITY_KEY), password);
    }

    /**
     * AES 解密
     *
     * @param username
     * @param password 加密后的密码
     * @return 解密后的密码
     */
    public static String decrypt(String username, String password) {
        return AesUtils.decrypt(MD5(username + PW_SECURITY_KEY), password);
    }

    /**
     * 加密字符串
     *
     * @param s 字符串
     * @return
     */
    public static String MD5(String s) {
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            byte[] btInput = s.getBytes();
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char[] str = new char[j * 2];
            int k = 0;
            for (byte byte0 : md) {
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
//            log.error("MD5生成失败", e);
            return null;
        }
    }
}
