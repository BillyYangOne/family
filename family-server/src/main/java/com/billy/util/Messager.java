package com.billy.util;

public class Messager {

    private String code;
    private String message;
    private Object data;

    public static String SUCCESS_MSG = "ok";
    public static String SUCCESS_CODE = "200";
    public static String ERROR_MSG = "error";
    public static String ERROR_CODE = "500";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
