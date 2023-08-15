package com.agile.demo.dto;

import com.agile.demo.model.PostEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
public class CommentDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    private PostEntity poardEntity;

    private String context;

    private String writer;

    private String password;

    private Integer commentRef;

    private Integer commentStep;

    private Integer commentLevel;
}
