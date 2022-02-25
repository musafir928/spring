package com.adil;

import com.adil.model.Comment;
import com.adil.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Adil");
        comment.setText("bean scope...");

        ApplicationContext context = SpringApplication.run(App.class, args);
        CommentService cs = context.getBean(CommentService.class);
        cs.publishComment(comment);
    }

}
