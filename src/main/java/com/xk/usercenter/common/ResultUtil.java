package com.xk.usercenter.common;

/**
 * 统一返回工具类
 */
public class ResultUtil {

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<T>(0,data,"ok","");
    }

    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }


    public static BaseResponse error(ErrorCode errorCode,String message, String description) {
        return new BaseResponse<>(errorCode,null,message,description);
    }

    public static BaseResponse error(int code,String message, String description) {
        return new BaseResponse<>(code,message,description);
    }



}
