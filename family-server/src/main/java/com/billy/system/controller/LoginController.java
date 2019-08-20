package com.billy.system.controller;

import com.billy.core.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录相关
 */
@Api(tags = "LoginController")
@RestController
@RequestMapping("login")
public class LoginController extends BaseController {


}
