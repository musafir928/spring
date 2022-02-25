package com.adil.proxy;

import com.adil.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("push")
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("sending push notification for comment: " + comment.getText() + "\n by: " + comment.getAuthor());

    }
}
