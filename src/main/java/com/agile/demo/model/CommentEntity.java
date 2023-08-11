package com.agile.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Comment")
public class CommentEntity extends BaseEntity{
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
    private Integer commentRef;

    @Column
    private Integer commentStep;

    @Column
    private Integer commentLevel;
}
