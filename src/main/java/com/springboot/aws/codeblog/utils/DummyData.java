package com.springboot.aws.codeblog.utils;


import com.springboot.aws.codeblog.model.Post;
import com.springboot.aws.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAuthor("Rui Lagos");
        post1.setDate(LocalDate.now());
        post1.setTitle("Docker");
        post1.setText("Docker is an open platform for developing, shipping, and running applications. Docker enables you to separate your applications from your infrastructure so you can deliver software quickly. With Docker, you can manage your infrastructure in the same ways you manage your applications. By taking advantage of Docker's methodologies for shipping, testing, and deploying code, you can significantly reduce the delay between writing code and running it in production.");

        Post post2 = new Post();
        post2.setAuthor("Jorge Coutinho");
        post2.setDate(LocalDate.now());
        post2.setTitle("API REST");
        post2.setText("A REST API (also known as RESTful API) is an application programming interface (API or web API) that conforms to the constraints of REST architectural style and allows for interaction with RESTful web services. REST stands for representational state transfer and was created by computer scientist Roy Fielding.");

        postList.add(post1);
        postList.add(post2);

        for(Post post : postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
