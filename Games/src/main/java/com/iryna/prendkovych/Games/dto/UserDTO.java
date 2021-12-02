package com.iryna.prendkovych.Games.dto;

import com.iryna.prendkovych.Games.entity.Game;

import java.time.LocalDate;
import java.util.List;

public class UserDTO {
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private LocalDate birth;
    private int countComments;

    private List<Game> userGameComment;


    public UserDTO() {
    }

    public UserDTO(Long id, String userName, String firstName, String lastName, LocalDate birth, int countComments, List<Game> userGameComment) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.countComments = countComments;
        this.userGameComment = userGameComment;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public List<Game> getUserGameComment() {
        return userGameComment;
    }

    public void setUserGameComment(List<Game> userGameComment) {
        this.userGameComment = userGameComment;
    }
}
