package com.oh.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oh.demo.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
  
}
