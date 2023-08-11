package com.agile.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Board")
public class PostEntity extends BaseEntity{

    @Column(length = 30, nullable = false)
    private String title;

    @Column(length = 4, nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    private String context;

    @Column(length = 10, nullable = false)
    private String writer;




}
