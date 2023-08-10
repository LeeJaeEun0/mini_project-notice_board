package com.agile.demo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column
    @OneToMany
    private List<PostEntity> boardEntity;

    @Column
    private String context;

    @Column
    private String writer;

    @Column
    private String password;

    @Column
    private Date createdate;

    @Column
    private Date updatedate;

    @Column
    private String ip;

    @Column
    private Integer commentRef;

    @Column
    private Integer commentStep;

    @Column
    private Integer commentLevel;
}
