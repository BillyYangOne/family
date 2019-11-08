package com.billy.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 异步方法测试
 */
@Service
public class AsyncService {

    private static Logger log = LoggerFactory.getLogger(AsyncService.class);

    private List<String> movies = new ArrayList<>(Arrays.asList(
            "Forrest Gump",
            "Titanic",
            "Spirited Away",
            "The Shawshank Redemption",
            "Zootopia",
            "Farewell ",
            "Joker"));

    /**
     * 找到特定字符开头的电影
     */
    @Async
    public CompletableFuture<List<String>> completableFutureTask(String start) {

        log.info(Thread.currentThread().getName() + " start the task!!");

        List<String> result = movies.stream().filter(movie -> movie.startsWith(start)).collect(Collectors.toList());

        //暂停几秒
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e){
            e.printStackTrace();
        }

        return CompletableFuture.completedFuture(result);
    }
}
