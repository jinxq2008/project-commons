package com.atguigu.project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyStringUtils {
    // yyyy-MM-dd hh:mm:ss
    
    // yyyy-MM-dd
	//����һ������Ϊ�ַ�����ʽ��
    public static String formatSimpleDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    //����ַ����Ƿ��ǿյ�
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