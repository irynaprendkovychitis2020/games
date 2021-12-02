package com.iryna.prendkovych.Games.repository;

import com.iryna.prendkovych.Games.entity.Game;
import com.iryna.prendkovych.Games.entity.Comment;
import com.iryna.prendkovych.Games.exception.ServiceException;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CommentRepository {

    @PostConstruct
    public void init(){
        savedComments = new ArrayList<>();
    }

    private static Long lastId = 1L;
    private List<Comment> savedComments;

    public Comment getCommentById(final Long id){
        return savedComments.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Comment with id: " + id + " not found ", null));
    }

    public List<Comment> getAllComment(){
        return savedComments;
    }

    public Comment createComment(final Comment comment){
        if(comment.getId() != null){
            throw new ServiceException(400, "Comment shouldn't have an id ", null);
        }

        ++lastId;
        comment.setId(lastId);

        savedComments.add(comment);

        return comment;
    }

    public Comment updateComment(final Comment comment){
        if(comment.getId() == null){
            throw new ServiceException(400, "Comment shouldn't have an id ", null);
        }

        final Comment savedComment = getCommentById(comment.getId());

        savedComment.setUserName(comment.getUserName());
        savedComment.setGeneratedDate(comment.getGeneratedDate());
        savedComment.setRating(comment.getRating());
        savedComment.setComment(comment.getComment());

        return savedComment;
    }

    public void deleteCommentById(final Long id){
        if(id == null){
            throw new ServiceException(400, "Id isn't specified", null);
        }

        savedComments.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Comment with id: " + id + " not found ", null));

        savedComments = savedComments.stream()
                .filter(e -> !e.getId().equals(id))
                .collect(Collectors.toList());

    }
}
