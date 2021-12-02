package com.iryna.prendkovych.Games.dto;

public class GameDTO {
    private Long id;
    private String gameName;
    private String genre;
    private String developers;
    private String publishers;
    private int countComments;

    public GameDTO() {
    }

    public GameDTO(Long id, String gameName, String genre, String developers, String publishers, int countComments) {
        this.id = id;
        this.gameName = gameName;
        this.genre = genre;
        this.developers = developers;
        this.publishers = publishers;
        this.countComments = countComments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDevelopers() {
        return developers;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }
}