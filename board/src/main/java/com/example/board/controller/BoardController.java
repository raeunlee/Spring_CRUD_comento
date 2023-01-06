package com.example.board.controller;

import com.example.board.entity.Board;
import com.example.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.crypto.CipherOutputStream;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;


    //게시판 작성 페이지 localhost:8090/board/wrtie
    //Get해오기
    @GetMapping("/board/write")

    public String boardWriteForm(){
        //위의 주소 접속시 BoardWrite.html 보여줌
        return "BoardWrite";
    }


    //POST, DB보내버리기
    @PostMapping("/board/writeaction")
    public String boardWriteAction(Board board) {

        boardService.write(board);
        return  "";
    }

    //작성된 게시글을 불러오는 컨트롤러
    //데이터를 담아 다른 페이지로 보내준다
    @GetMapping("/board/list")
    public String boardlist(Model model) {
        model.addAttribute("list", boardService.boardList());
        return"BoardList";

    }

    //게시글 상세페이지
    //localhost:8080/board/view?id=1 이런식
    @GetMapping("/board/view")
    public String boardView(Model model, Integer id){

        model.addAttribute("board",boardService.boardView(id));
        return"BoardView";
    }

}
