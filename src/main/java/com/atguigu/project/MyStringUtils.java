package com.atguigu.project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyStringUtils {
    // yyyy-MM-dd hh:mm:ss
    
    // yyyy-MM-dd
	//返回一个日期为字符串格式的
    public static String formatSimpleDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    //检查字符串是否是空的
    public static boolean isEmpty(String str) {
        if (str == null) {
            return true;
        }

        if (str.trim().equals("")) {
            return true;
        }
        
        return false;
    }

}
