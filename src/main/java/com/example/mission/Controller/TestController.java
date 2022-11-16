package com.example.mission.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/test1")
    public String test() {
        return "hi";
    }
}
