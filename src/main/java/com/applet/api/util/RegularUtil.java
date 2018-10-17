package com.applet.api.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhouhuahu on 2018/4/3.
 */
public class RegularUtil {

    /**
     * 正则校验手机号格式
     * @param mobile
     * @return
     */
    public static boolean checkMobile(String mobile){
        String reg = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,3,5-9]))\\d{8}$";
        if(mobile.length() != 11){
            return false;
        }else{
            Pattern p = Pattern.compile(reg);
            Matcher m = p.matcher(mobile);
            return m.matches();
        }
    }

    /**
     * 正则校验邮箱格式
     * @param email
     * @return
     */
    public static boolean checkEmail(String email){
        String reg = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(email);
        return m.matches();
    }
}
