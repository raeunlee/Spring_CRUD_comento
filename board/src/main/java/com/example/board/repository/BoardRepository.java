package com.example.board.repository;


import com.example.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //왼쪽에 내가 만들어준 Board entity를 넣고, 프라이머리키 기본키의 타입을 넣음된다
public interface BoardRepository extends JpaRepository <Board, Integer>{
}
