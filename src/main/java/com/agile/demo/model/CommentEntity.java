package com.agile.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name="Comment")
public class CommentEntity extends BaseEntity{

    @JoinColumn(name="post_number",referencedColumnName = "number")
    @ManyToOne
    @JsonBackReference
    private PostEntity postEntity;

    @Column(length = 100, nullable = false)
    private String context;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 4, nullable = false)
    private String password;

    @Column(nullable = false)
    private Integer commentRef;

    @Column(nullable = false)
    private Integer commentStep;

    @Column(nullable = false)
    private Integer commentLevel;
}
