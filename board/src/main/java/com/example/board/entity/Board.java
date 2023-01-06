package com.example.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

@Data
//board안의 데이터들을 하나씩 get해오고 싶을때, 쓸수있는 롬복 어노테이션

public class Board {

    @Id //primary key를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //generatedValue가 데이터를 읽어서 처리해줌
    private Integer id;
    private String title;
    private String content;
}

//컨트롤러의 title과 content 매개변수를 받는법?
//html에서 일단 폼에서 title, content가 넘어옴, 컨트롤러 안의 매개변수로 담아 넘어옴
//entity를 만드는 이유? 일일이 title, content 지정해주면, 나중에 더 많아지면 귀찬흥니 클래스로 보드를 만들어서 한번에 받아오기 위함이다
//그래서 컨트롤러에 Board board로 간결하게 쓸수가 있는 것