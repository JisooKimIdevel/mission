package com.example.mission.Controller;

import com.example.mission.Dto.BoardDto;
import com.example.mission.Service.BoardService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
    @Autowired
    BoardService boardService;

    @RequestMapping(value = "/boardList", method = RequestMethod.POST)
    public String boardList(@ModelAttribute BoardDto dto) {
        Gson gson = new Gson();
        HashMap<String,Object> map = new HashMap<>();
        ArrayList<BoardDto> list = new ArrayList<>();

        String jsonString = gson.toJson(map);
        return jsonString;
    }
}
