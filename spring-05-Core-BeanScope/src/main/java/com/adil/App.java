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
        comment.setText("bean scope...");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // ========= default scope is singleton ======//
        // CommentService cs1 = context.getBean(CommentService.class);
        // CommentService cs2 = context.getBean(CommentService.class);
        // ==========  end of singleton ============//

        // ========= prototype scope ======//
        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);
        // ==========  end of prototype ============//

        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs1 == cs2);

    }

}
