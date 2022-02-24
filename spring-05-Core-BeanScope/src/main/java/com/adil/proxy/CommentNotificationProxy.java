package com.adil.proxy;

import com.adil.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
