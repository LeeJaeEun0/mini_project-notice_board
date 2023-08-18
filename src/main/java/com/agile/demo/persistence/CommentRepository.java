package com.agile.demo.persistence;

import com.agile.demo.model.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository  extends JpaRepository<CommentEntity, Long> {
    List<CommentEntity> findByPostEntity_NumberAndDeleteAtIsNull(Long number);
    List<CommentEntity> findByDeleteAtIsNull();


}
