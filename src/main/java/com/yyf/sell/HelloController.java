package com.yyf.sell;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author yeyifei
 * @Date 2018/10/9 12:06 AM
 * @Version 1.0
 **/
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String say() {
        return "hello,World";
    }
}
