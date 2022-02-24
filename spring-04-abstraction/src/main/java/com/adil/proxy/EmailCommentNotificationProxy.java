package com.adil.proxy;

import com.adil.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("sending notification for comment: " + comment.getText() + "\nby: " + comment.getAuthor());
    }
}
