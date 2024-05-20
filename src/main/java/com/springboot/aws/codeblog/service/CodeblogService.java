package com.springboot.aws.codeblog.service;

import com.springboot.aws.codeblog.model.Post;
import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save (Post post);
}
