package com.agile.demo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Comment")
public class CommentEntity {
    @Id
    @Column
    private Integer number;

    @Column
    @OneToMany
    private List<BoardEntity> boardEntity;

    @Column
    private String context;

    @Column
    private String writer;

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
