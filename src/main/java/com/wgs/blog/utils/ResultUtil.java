package com.wgs.blog.utils;


import com.wgs.blog.entity.blog.ResultData;

import java.util.Map;

public class ResultUtil {
     public static ResultData getResultData(String code, String message, Map data){

         return new ResultData(code,message, data);
     }
}
