package com.iryna.prendkovych.Games.dto;


import java.time.LocalDate;

public class CommentDTO {
    private Long id;
    private String userName;
    private LocalDate generatedDate;
    private int rating;
    private String comment;;

    public CommentDTO() {
    }

    public CommentDTO(Long id, String userName, LocalDate generatedDate, int rating, String comment) {
        this.id = id;
        this.userName = userName;
        this.generatedDate = generatedDate;
        this.rating = rating;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}