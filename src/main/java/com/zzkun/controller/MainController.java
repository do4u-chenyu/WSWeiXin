package com.zzkun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/6/17.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "Index";
    }
}
