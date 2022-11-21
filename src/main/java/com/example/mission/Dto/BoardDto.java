package com.example.mission.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class BoardDto {
    private int boardSeq;
    private String boardTitle;
    private String boardCont;
    private String regId;
    private Timestamp regDt;
    private String modId;
    private Timestamp modDt;
    private String delId;
    private Timestamp delDt;
    private String delYn;
    private int readCnt;

}
