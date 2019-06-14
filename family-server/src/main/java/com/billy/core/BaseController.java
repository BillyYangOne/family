package com.billy.core;

import com.billy.util.MessageUtil;

/**
 * 控制层基类
 */
public class BaseController {

    protected MessageUtil messager;

    public BaseController() {
        this.messager = new MessageUtil();
    }
}
