package com.agile.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Setter
@Getter
public class PostDto {
    private Long number;

    private String title;

    private String password;

    private String context;

    private String writer;

    private Integer views;

    private LocalDateTime savedAt;

    private LocalDateTime modifiedAt;

    private LocalDateTime deleteAt;

    private String ip;
}
