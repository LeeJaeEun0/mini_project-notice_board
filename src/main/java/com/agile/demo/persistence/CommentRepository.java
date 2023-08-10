package com.agile.demo.persistence;

import com.agile.demo.model.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository<CommentEntity, Long> {
}
