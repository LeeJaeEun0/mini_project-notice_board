package com.agile.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
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
