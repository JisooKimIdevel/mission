package com.example.mission.Controller;

import com.example.mission.Dto.BoardDto;
import com.example.mission.Entity.BoardEntity;
import com.example.mission.Repository.BoardRepository;
import com.example.mission.Service.BoardService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@Controller
@Slf4j
@RequestMapping(value = "/board")
public class BoardController {
    @Autowired
    BoardRepository boardRepository;

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
    @RequestMapping(value = "/boardInsert", method = RequestMethod.POST)
    public String insert(String boardTitle, String boardCont) {
        log.info("controller");
        Gson gson = new Gson();
        HashMap<String,Object> map = new HashMap<>();
        BoardEntity entity = BoardEntity.builder()
                                        .boardTitle(boardTitle)
                                        .boardCont(boardCont)
                                        .regId("kjs")
                                        .delYn("N")
                                        .build();
        entity = boardRepository.save(entity);
        map.put("entity",entity);
        String jsonString = gson.toJson(map);
        return jsonString;
    }
    @ResponseBody
    @RequestMapping(value = "/boardList", method = RequestMethod.POST)
    public String select() {
        List<BoardEntity> list = boardRepository.findAll();
        Gson gson = new Gson();
        HashMap<String,Object> map = new HashMap<>();
        map.put("list", list);
        String jsonString = gson.toJson(map);
        return jsonString;
    }
    @ResponseBody
    @RequestMapping(value = "/boardSel", method = RequestMethod.POST)
    public String boardSel(int boardSeq) {
        log.info("boardSeq : " + boardSeq);
        Optional<BoardEntity> entity = boardRepository.findById(boardSeq);
        Gson gson = new Gson();
        HashMap<String,Object> map = new HashMap<>();
        map.put("boardInfo", entity);
        log.info("map : " + map);
        log.info("entity : " + entity);
        String jsonString = gson.toJson(map);
        log.info(jsonString);
        return jsonString;
    }
    @ResponseBody
    @RequestMapping(value = "/boardUpdate", method = RequestMethod.POST)
    public String update(int boardSeq, String boardTitle, String boardCont) {
        Gson gson = new Gson();
        HashMap<String,Object> map = new HashMap<>();
        BoardEntity entity = BoardEntity.builder()
                                        .boardSeq(boardSeq)
                                        .boardTitle(boardTitle)
                                        .boardCont(boardCont)
                                        .modId("kjs")
                                        .build();
        entity = boardRepository.save(entity);
        map.put("entity",entity);
        String jsonString = gson.toJson(map);
        return jsonString;
    }
    @ResponseBody
    @RequestMapping(value = "/boardDelete", method = RequestMethod.POST)
    public String delete(int boardSeq, String boardTitle, String boardCont) {
        Gson gson = new Gson();
        HashMap<String,Object> map = new HashMap<>();
        BoardEntity entity = BoardEntity.builder()
                                        .boardSeq(boardSeq)
                                        .boardTitle(boardTitle)
                                        .boardCont(boardCont)
                                        .delId("kjs")
                                        .delYn("Y")
                                        .build();
        entity = boardRepository.save(entity);
        map.put("entity",entity);
        String jsonString = gson.toJson(map);
        return jsonString;
    }
}
