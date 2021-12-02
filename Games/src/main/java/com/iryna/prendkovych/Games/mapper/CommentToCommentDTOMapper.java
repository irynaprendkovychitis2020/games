package com.iryna.prendkovych.Games.mapper;

import com.iryna.prendkovych.Games.dto.CommentDTO;
import com.iryna.prendkovych.Games.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentToCommentDTOMapper {
    public Comment toEntity (final CommentDTO commentDTO){
        final Comment comment = new Comment();

        comment.setId(commentDTO.getId());
        comment.setUserName(commentDTO.getUserName());
        comment.setGeneratedDate(commentDTO.getGeneratedDate());
        comment.setRating(commentDTO.getRating());
        comment.setComment(commentDTO.getComment());

        return comment;
    }

    public CommentDTO toDTO (final Comment comment){
        final CommentDTO commentDTO = new CommentDTO();

        commentDTO.setId(comment.getId());
        commentDTO.setUserName(comment.getUserName());
        commentDTO.setGeneratedDate(comment.getGeneratedDate());
        commentDTO.setRating(comment.getRating());
        commentDTO.setComment(comment.getComment());

        return commentDTO;
    }


}
