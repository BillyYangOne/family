package com.billy.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 定时任务测试
 * 2019年11月7日 14点38分
 *      @EnableAsync 和 @Async 使定时任务并行执行
 */
@EnableAsync
@Component
public class ScheduledTask {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * fixedRate = 2000 每2秒执行一次
     */
//    @Scheduled(fixedRate = 2000)
    @Async
    public void repeatByRate() {

        System.out.println("线程名称为：" + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(3);
            logger.info("Fix delay task :  The time is now {} ", dateFormat.format(new Date()));

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
