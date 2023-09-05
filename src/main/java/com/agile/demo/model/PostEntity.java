package com.agile.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name="Post")
public class PostEntity extends BaseEntity{

    @Column(length = 30, nullable = false)
    private String title;

    @Column(length = 4, nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    private String context;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(nullable = false)
    private Integer views;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "postEntity",cascade = CascadeType.REMOVE)
    @JsonManagedReference
    private List<CommentEntity> commentEntity;
}
