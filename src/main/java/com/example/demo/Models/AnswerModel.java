package com.example.demo.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "disc")
@Data

public class AnswerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "disc")
    private String disc;

    @Column(name = "name")
    private String name;

}
