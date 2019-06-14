package com.billy.core;

import com.billy.util.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 控制层基类
 */
public class BaseController {

    protected MessageUtil messager;

    protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    public BaseController() {
        this.messager = new MessageUtil();
    }
}
