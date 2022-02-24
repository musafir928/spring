package com.adil.repository;

import com.adil.model.Comment;

public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("storing notification for comment: " + comment.getText() + "\nby: " + comment.getAuthor());
    }
}
