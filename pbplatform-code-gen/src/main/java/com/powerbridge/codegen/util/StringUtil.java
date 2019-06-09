package com.powerbridge.codegen.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日下午6:06:39
 */
public class StringUtil {

	public static String ToUpperName(String str) throws Exception {
        String[] strsOld = str.split("_");
        if ((str.length() <= 0)) {
            throw new Exception("table or field name rule wrong, please use xx_xx or xx or _xx..");
        }

        List<String> strList = new ArrayList<String>(Arrays.asList(strsOld));
        strList.remove("");

        String[] strs = {};
        strs = strList.toArray(strs);
        StringBuilder stringBuilder = new StringBuilder();
        if (strs.length > 1) {
            for (int i = 0; i < strs.length; i++) {
                stringBuilder.append(strs[i].toUpperCase().charAt(0));
                stringBuilder.append(strs[i].substring(1));
            }
        } else {
            stringBuilder.append(strs[0].toUpperCase().charAt(0));
            stringBuilder.append(strs[0].substring(1));
        }

        return stringBuilder.toString();
    }

    public static String ToSimpleName(String str) {
        String[] strs = str.split("_");
        String simpleName = strs[0];
        if (strs.length > 1)
        {
            simpleName = str.replaceFirst(strs[0] + "_", "");
        }
        return simpleName;
    }

    public static String ToHumpName(String str) throws Exception {
        String[] strsOld = str.split("_");
        if ((str.length() <= 0)) {
            throw new Exception("table or field name rule wrong, please use xx_xx or xx or _xx..");
        }

        List<String> strList = new ArrayList<String>(Arrays.asList(strsOld));
        strList.remove("");

        String[] strs = {};
        strs = strList.toArray(strs);
        StringBuilder stringBuilder = new StringBuilder();
        if (strs.length > 1) {
            for (int i = 0; i < strs.length; i++) {
                if(i == 0){
                    stringBuilder.append(strs[i].toLowerCase());
                }else{
                    stringBuilder.append(strs[i].toUpperCase().charAt(0));
                    stringBuilder.append(strs[i].substring(1).toLowerCase());
                }
            }
        } else {
            stringBuilder.append(strs[0].toLowerCase());
        }

        return stringBuilder.toString();
    }

}

