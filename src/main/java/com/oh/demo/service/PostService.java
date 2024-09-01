package com.oh.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oh.demo.mapper.PostMapper;
import com.oh.demo.model.Post;
import com.oh.demo.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
  private final PostRepository postRepository;
  private final PostMapper postMapper;

  public List<Post> postList() {
    // return postRepository.findAll();
    return postMapper.listPost();
  }

  public List<Post> postTitle(String title) {
    return postRepository.findByTitleContains(title);
  }
}
