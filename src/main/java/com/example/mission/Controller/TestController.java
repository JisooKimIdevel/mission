package com.example.mission.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequestMapping(value = "/test")
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/test1")
    public String test() {
        return "hi";
    }
    @ResponseBody
    @RequestMapping(value = "/gugudan")
    public String gugudan() {
        String result = "";
        result += "<table><tr>";
        for(int i=1; i<=9; i++) {
            result += "<td style='padding:15px;'>";
            for(int j=1; j<=9; j++) {

                result += i + "*" + j + "=" + (i*j) + "<br>";
            }
            result += "</td>";
        }
        result += "</tr></table>";
        return result;
    }

}
