package com.agile.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class PostDto {
    private Long number;

    private String title;

    private String password;

    private String context;

    private String writer;

    private Date createDate;

    private Date updateDate;

    private Date deleteDate;

    private String ip;
}
