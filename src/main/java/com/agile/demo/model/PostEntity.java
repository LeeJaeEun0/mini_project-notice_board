package com.agile.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Board")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(length = 30, nullable = false)
    private String title;

    @Column(length = 4, nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    private String context;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(updatable = false, nullable = false)
    private Date createdate;

    @Column
    private Date updatedate;

    @Column
    private String ip;



}
