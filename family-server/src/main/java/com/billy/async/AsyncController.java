package com.billy.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * 异步请求方法测试类
 */
@RestController
@RequestMapping("/async")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("movies")
    public String completeFutureTask() {

        try {

            long start = System.currentTimeMillis();
            List<String> words = Arrays.asList("S", "T", "F", "Z", "J");
            List<CompletableFuture<List<String>>> collect = words.stream()
                    .map(word -> asyncService.completableFutureTask(word))
                    .collect(Collectors.toList());

            List<List<String>> result = collect.stream().map(CompletableFuture::join).collect(Collectors.toList());

            System.out.println("Time taken " + (System.currentTimeMillis() - start));

            return result.toString();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Done";
    }
}
