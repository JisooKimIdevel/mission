package com.example.mission.Entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;



@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    @CreationTimestamp
    private Timestamp regDt;

    @Column(length = 50)
    private String modId;

    @UpdateTimestamp
    private Timestamp modDt;

    @Column(length = 50)
    private String delId;

    @UpdateTimestamp
    private Timestamp delDt;

    @Column(length = 10)
    private String delYn;

    @Column
    private int readCnt;

}
