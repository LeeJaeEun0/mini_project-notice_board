package com.agile.demo.persistence;

import com.agile.demo.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostReposity extends JpaRepository<PostEntity, Long> {
}
