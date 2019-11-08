package com.billy.system.controller;

import com.billy.core.BaseController;
import com.billy.util.KettleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("kettle")
public class KettleController extends BaseController {

    @Autowired
    private KettleService kettleService;

    @RequestMapping("job")
    public Object executeJob(){

        logger.debug("开始。。。");
        String jobName = "testJob.kjb";
        Map<String, String> params = new HashMap<>();
        params.put("FROM_HOST", "10.0.10.50");
        params.put("FROM_DB", "dp_smart_test");
        params.put("FROM_DB_USER", "dp_smart");
        params.put("FROM_DB_PASS", "Szewec");
        params.put("TO_HOST", "127.0.0.1");
        params.put("TO_DB", "postgres");
        params.put("TO_DB_USER", "postgres");
        params.put("TO_DB_PASS", "123456");

        boolean result = kettleService.runKjb(jobName, params);
        if(result){
            return messager.successResponse("执行成功！");
        }else{
            return messager.errorResponse("执行失败！");
        }
    }
}
