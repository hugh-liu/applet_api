package com.applet.api.util.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhouhuahu on 2018/6/26.
 */
public class Constants {

    public static final String SESSION_WE_CHANT_INFO = "WeChantLoginInfo";

    /**
     * AJAX返回代码
     */
    public static final String ERROR_CODE = "-1";
    public static final String SUCCESS_CODE = "1";
    public static final String EXPIRED_CODE = "-2";


    /**
     * 时间格式
     */
    public static final String DEFAULT_DATE_FORMAT_STAMP = "yyyyMMddHHmmss";
    public static final String DATE_TIME_YMD = "YYYY-MM-DD";

    //绑定手机号图形验证码
    public static final String BIND_MOBILE_FIGURE_CODE = "bindMobile";
    //添加绑定手机号
    public static final String BIND_MOBILE_TO_ADD = "bindWx";
    //修改绑定手机号
    public static final String BIND_MOBILE_TO_UPDATE = "updateBindMobile";
    //绑定微信短信模板类型
    public static final String BIND_MOBILE_OPERATION = "bindWx";
    //绑定微信短信验证码类型
    public static final String BIND_MOBILE_TYPE = "APPLET";
    //短信每日发送次数
    public static final Integer SMS_CODE_AMOUNT = 3;

    public static final Map<Integer, String> TEMPLATE_TEXT_TYPE = new HashMap<Integer, String>(){
        {
            put(1, "标题");
            put(2, "内容");
            put(3, "地图");
        }
    };



}
