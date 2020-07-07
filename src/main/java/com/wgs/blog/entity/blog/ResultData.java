package com.wgs.blog.entity.blog;

import java.util.Map;

public class ResultData {
    private final String code;
    private final String message;
    private final Map resultData;
    public ResultData(String code, String message, Map resultData){
        this.code = code;
        this.message = message;
        this.resultData = resultData;
    }
    public String getCode(){
        return this.code;
    }

    public String getMessage() {
        return message;
    }

    public Map getResultData() {
        return resultData;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", resultData='" + resultData + '\'' +
                '}';
    }
}
