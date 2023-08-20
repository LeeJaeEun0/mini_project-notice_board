package com.agile.demo.persistence;

import com.agile.demo.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostReposity extends JpaRepository<PostEntity, Long> {
    List<PostEntity> findByDeleteAtIsNull();
    List<PostEntity> findByDeleteAtIsNullAndTitle(String text);
}
