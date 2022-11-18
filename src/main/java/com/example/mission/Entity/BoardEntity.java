package com.example.mission.Entity;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@Table(name="board_tb")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardSeq;

    @Column(length = 50, nullable = false)
    private String boardTitle;
    @Column(length = 2000, nullable = false)
    private String boardCont;
    @Column(length = 50)
    private String regId;
    @Column(length = 50)
    private String regDt;
    @Column(length = 50)
    private String modId;
    @Column(length = 50)
    private String modDt;
    @Column(length = 50)
    private String delId;
    @Column(length = 50)
    private String delDt;
    @Column(length = 10)
    private String delYn;
    @Column
    private int readCnt;

}
