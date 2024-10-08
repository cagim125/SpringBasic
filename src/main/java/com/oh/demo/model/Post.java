package com.oh.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID postId;
  
  private String title;
  private String contents;
  private String author;
  private LocalDateTime createdAt;
}
