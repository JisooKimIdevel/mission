package com.example.mission.Controller;

import com.example.mission.Dto.BoardDto;
import com.example.mission.Entity.BoardEntity;
import com.example.mission.Service.BoardService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@Slf4j
@RequestMapping(value = "/board")
public class BoardController {
    @Autowired
    BoardService boardService;


    @GetMapping(value = "/")
    public String index() {
        log.info("/board/");
        return "board/boardList";
    }
    @GetMapping(value = "/boardDetail")
    public String boardDetail() {
        log.info("/board/boardDetail");
        return "board/boardDetail";
    }
    @GetMapping(value = "/boardInsertPage")
    public String boardInsertPage() {
        log.info("/board/boardInsertPage");
        return "board/boardInsert";
    }
    @GetMapping(value = "/boardUpdatePage")
    public String boardUpdatePage() {
        log.info("/board/boardUpdatePage");
        return "board/boardUpdate";
    }

    @ResponseBody
    @RequestMapping(value = "/boardList", method = RequestMethod.POST)
    public String boardList(@ModelAttribute BoardEntity ett) {
        log.info("controller - boardList");
        Gson gson = new Gson();
        HashMap<String,Object> map = new HashMap<>();
        ArrayList<BoardEntity> list = new ArrayList<>();
        list = boardService.boardList(ett);
        log.info("list : " + list);
        map.put("list",list);
        log.info("map : " + map);
        String jsonString = gson.toJson(map);
        log.info("jsonString" + jsonString);
        return jsonString;
    }
    @RequestMapping(value = "/boardInsert", method = RequestMethod.POST)
    public String boardInsert(@ModelAttribute BoardEntity ett) {
        Gson gson = new Gson();
//        HashMap<String,Object> map = new HashMap<>();
        ArrayList<BoardEntity> list = new ArrayList<>();
        list = boardService.boardInsert(ett);
//        map.put("list",list);
        String jsonString = gson.toJson(list);
        return jsonString;
    }
    @RequestMapping(value = "/boardUpdate", method = RequestMethod.POST)
    public String boardUpdate(@ModelAttribute BoardEntity ett) {
        Gson gson = new Gson();
//        HashMap<String,Object> map = new HashMap<>();
        ArrayList<BoardEntity> list = new ArrayList<>();
        list = boardService.boardUpdate(ett);
//        map.put("list",list);
        String jsonString = gson.toJson(list);
        return jsonString;
    }
    @RequestMapping(value = "/boardDelete", method = RequestMethod.POST)
    public String boardDelete(@ModelAttribute BoardEntity ett) {
        Gson gson = new Gson();
//        HashMap<String,Object> map = new HashMap<>();
        ArrayList<BoardEntity> list = new ArrayList<>();
        list = boardService.boardDelete(ett);
//        map.put("list",list);
        String jsonString = gson.toJson(list);
        return jsonString;
    }
}
