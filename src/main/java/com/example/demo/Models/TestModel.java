package com.example.demo.Models;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "test")
@Data
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "answer_1")
    private String answer1;

    @Column(name = "answer_2")
    private String answer2;

    @Column(name = "answer_3")
    private String answer3;

    @Column(name = "answer_4")
    private String answer4;

    @Column(name = "answer_5")
    private String answer5;

    @Column(name="name")
    private String user;

    @Column(name="if_check")
    private boolean ifCheck;

}
