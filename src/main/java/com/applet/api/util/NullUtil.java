package com.applet.api.util;

import java.util.List;

/**
 * @author zhouhuahu on 2018/6/26.
 */
public class NullUtil {
//    private static RedisSessionManager manager = null;

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isNullOrEmpty(String str){
        if(null == str)
            return true;
        else
            return str.trim().equals("") ? true : false;
    }

    /**
     * 判断字符串是否不为空
     * @param str
     * @return
     */
    public static boolean isNotNullOrEmpty(String str){
        return !isNullOrEmpty(str);
    }


    /**
     * 判断整型是否不为空
     * @param num
     * @return
     */
    public static boolean isNotNullOrEmpty(Integer num){
        return null == num ? false : true;
    }

    /**
     * 判断List对象是否为空
     * @param list
     * @return
     */
    public static boolean isNotNullOrEmpty(List list){
        return (null != list && list.size() > 0) ? true : false;
    }


}
