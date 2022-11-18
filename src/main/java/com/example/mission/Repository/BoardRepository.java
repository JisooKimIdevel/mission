package com.example.mission.Repository;

import com.example.mission.Dto.BoardDto;
import com.example.mission.Entity.BoardEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface BoardRepository extends JpaRepository<BoardEntity,String> {
    @Query(value = "select * from board_tb where del_yn = 'N'", nativeQuery = true)
    public ArrayList<BoardEntity> boardList(BoardEntity ett);
    @Query(value = "insert into board_tb(boardSeq,boardCont,regId,regDt,delYn) values()", nativeQuery = true)
    public ArrayList<BoardEntity> boardInsert(BoardEntity ett);
    @Query(value = "update board_tb set where delYn = 'N'", nativeQuery = true)
    public ArrayList<BoardEntity> boardUpdate(BoardEntity ett);
    @Query(value = "update board_tb set where delYn = 'N'", nativeQuery = true)
    public ArrayList<BoardEntity> boardDelete(BoardEntity ett);
}

