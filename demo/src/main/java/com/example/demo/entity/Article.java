package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //DB가 해당 객체를 인식가능
@AllArgsConstructor
@ToString
@Data

public class Article {

    @Id
    @GeneratedValue // 자동생성어노테이션
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

}

