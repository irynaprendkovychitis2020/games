package com.iryna.prendkovych.Games.resource;

import com.iryna.prendkovych.Games.service.GameService;
import com.iryna.prendkovych.Games.dto.CommentDTO;
import com.iryna.prendkovych.Games.dto.GameDTO;
import com.iryna.prendkovych.Games.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @GetMapping("/games/{id}/comments/{id}")
    public CommentDTO getCommentById(final @PathVariable Long id){
        return commentService.getCommentById(id);
    }

    @GetMapping("/games/{id}/comments")
    public List<CommentDTO> getAllComment(){
        return commentService.getAllComment();
    }

    @PostMapping("/games/{id}/comments")
    public CommentDTO createComment(final /*@Valid*/ @RequestBody CommentDTO commentDTO, @PathVariable Long id){
        return commentService.createComment(commentDTO, id);
    }

    @PutMapping("/games/{id}/comments/{id}")
    public CommentDTO getCommentById(final @RequestBody CommentDTO commentDTO){
        return commentService.updateComment(commentDTO);
    }

    @DeleteMapping("/games/{id}/comments/{id}")
    public void deleteCommentById(final @PathVariable Long id){
        commentService.deleteCommentById(id);
    }

}
