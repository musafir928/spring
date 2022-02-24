package com.adil;

import com.adil.config.ProjectConfig;
import com.adil.model.Comment;
import com.adil.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Adil");
        comment.setText("Spring framework...");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }

}
