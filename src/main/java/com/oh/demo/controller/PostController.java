package com.oh.demo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oh.demo.model.Post;
import com.oh.demo.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

  private final PostService postService;

  
  @GetMapping("/list")
  public List<Post> postList() {
    return postService.postList();
  }

  @GetMapping("/search")
  public List<Post> postTitle(@RequestParam("title") String title) {
    return postService.postTitle(title);
  }

  @GetMapping("/{postId}")
  public Post postDetail(@PathVariable String postId) {
    return new Post(UUID.randomUUID(), "title2", "content3", "", LocalDateTime.now());

  }
  
}
