package com.agile.demo.model;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @CreatedDate
    @Column(updatable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createDate;

    @LastModifiedDate
    @Column
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updateDate;

    @Column
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date deleteDate;

    @Column
    private String ip;

}
