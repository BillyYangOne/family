package com.billy.util;

import org.springframework.util.StringUtils;

public class MessageUtil {

    /**
     * 返回成功对象
     * @param obj
     * @return
     */
    public Messager successObjectResponse(Object obj){
        Messager messager = new Messager();
        messager.setCode(Messager.SUCCESS_CODE);
        messager.setMessage(Messager.SUCCESS_MSG);
        messager.setData(obj);
        return messager;
    }

    /**
     * 返回成功消息
     * @param msg
     * @return
     */
    public Messager successResponse(String msg){
        Messager messager = new Messager();
        messager.setCode(Messager.SUCCESS_CODE);
        if(StringUtils.isEmpty(msg)){
            messager.setMessage(Messager.SUCCESS_MSG);
        }else{
            messager.setMessage(msg);
        }
        return messager;
    }

    /**
     * 返回失败消息
     * @param msg
     * @return
     */
    public Messager errorResponse(String msg){
        Messager messager = new Messager();
        messager.setCode(Messager.ERROR_CODE);
        if(StringUtils.isEmpty(msg)){
            messager.setMessage(Messager.ERROR_MSG);
        }else{
            messager.setMessage(msg);
        }
        return messager;
    }

}
