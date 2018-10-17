package com.applet.api.util;

import java.io.File;

/**
 * Created by zhouhuahu 2018/08/07
 */
public class GetWebProjectRealPathTool {
    /**
     * 获取项目在服务其中的真实路径的工具类
     * 这是在web项目中，获取项目实际路径的最佳方式，在windows和linux系统下均可正常使用
     */

    //获取项目的根路径
    private static String classPath = GetWebProjectRealPathTool.class.getClassLoader().getResource("/").getPath();
    //对项目的根路径进行解析，拿到项目路径
    public static String getRootPath(String sourcePath) {
        String rootPath = "";
        //windows下
        if ("\\".equals(File.separator)) {
            rootPath = classPath.substring(1, classPath.indexOf("/WEB-INF/classes")) + sourcePath;
            rootPath = rootPath.replace("/", "\\");
        }
        //linux下
        if ("/".equals(File.separator)) {
            rootPath = classPath.substring(0, classPath.indexOf("/WEB-INF/classes")) + sourcePath;
            rootPath = rootPath.replace("\\", "/");
        }
        return rootPath;
    }

    public static String getClassPath(String filePath){
        String rootPath = "";
        //windows下
        if ("\\".equals(File.separator)) {
            rootPath = classPath.substring(1, classPath.length()) + filePath;
            rootPath = rootPath.replace("/", "\\");
        }
        //linux下
        if ("/".equals(File.separator)) {
            rootPath = classPath.substring(0, classPath.length()) + filePath;
            rootPath = rootPath.replace("\\", "/");
        }
        return rootPath;
    }

}
