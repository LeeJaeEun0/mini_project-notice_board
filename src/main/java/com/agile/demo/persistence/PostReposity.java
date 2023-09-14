package com.agile.demo.persistence;

import com.agile.demo.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostReposity extends JpaRepository<PostEntity, Long> {
    List<PostEntity> findByDeleteAtIsNull();
    List<PostEntity> findByDeleteAtIsNullAndTitle(String text);

    @Query("SELECT p FROM PostEntity p WHERE p.title like %:text% AND p.deleteAt is null")
    List<PostEntity> findText(@Param("text") String text);
}
