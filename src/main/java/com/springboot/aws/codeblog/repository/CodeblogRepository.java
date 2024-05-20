package com.springboot.aws.codeblog.repository;

import com.springboot.aws.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
