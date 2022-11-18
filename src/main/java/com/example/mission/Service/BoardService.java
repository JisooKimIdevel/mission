package com.example.mission.Service;

import com.example.mission.Entity.BoardEntity;
import com.example.mission.Repository.BoardRepository;
import com.example.mission.Dto.BoardDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class BoardService {
    @Autowired
    BoardRepository boardRepository;
    public ArrayList<BoardEntity> boardList(BoardEntity ett) {
        log.info("service - list");
        return boardRepository.boardList(ett);
    }
    public ArrayList<BoardEntity> boardInsert(BoardEntity ett) {
        return boardRepository.boardInsert(ett);
    }
    public ArrayList<BoardEntity> boardUpdate(BoardEntity ett) {
        return boardRepository.boardUpdate(ett);
    }
    public ArrayList<BoardEntity> boardDelete(BoardEntity ett) {
        return boardRepository.boardDelete(ett);
    }

}
