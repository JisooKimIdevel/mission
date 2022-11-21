package com.example.mission.Repository;

import com.example.mission.Dto.BoardDto;
import com.example.mission.Entity.BoardEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
public interface BoardRepository extends JpaRepository<BoardEntity,Integer> {
}

