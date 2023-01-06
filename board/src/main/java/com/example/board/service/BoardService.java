package com.example.board.service;

import com.example.board.entity.Board;
import com.example.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired //의존성주입 ㅜ 어려웡 찾아보기
    private BoardRepository boardRepository;

    //글 작성 처리
    public void write(Board board){
        boardRepository.save(board);

    }

    //게시글 -> 리스트 처리
    public List<Board> boardList() {
        return boardRepository.findAll();
        //findAll은 board가 담긴 List반환


    }

    //상세페이지를 위한 특정 게시글 불러오기

    //id를 기준으로 받아주는것
    public Board boardView(Integer id){
        return boardRepository.findById(id).get();


    }



}
