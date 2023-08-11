package com.agile.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(updatable = false)
    private Date createDate;

    @Column
    private Date updateDate;

    @Column
    private Date deleteDate;

    @Column
    private String ip;

}
