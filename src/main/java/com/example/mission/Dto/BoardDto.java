package com.example.mission.Dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDto {
    private int boardSeq;
    private String boardTitle;
    private String boardCont;
    private String regId;
    private String regDt;
    private String modId;
    private String modDt;
    private String delId;
    private String delDt;
    private String delYn;
    private int readCnt;
}
