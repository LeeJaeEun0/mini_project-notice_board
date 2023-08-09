package com.agile.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Board")
public class BoardEntity {

    @Id
    @Column
    private Integer number;

    @Column
    private String Title;

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



}
