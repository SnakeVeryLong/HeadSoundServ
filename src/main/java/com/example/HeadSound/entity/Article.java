package com.example.HeadSound.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "articles")
public class Article {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer articleId;
    @Column(name = "message")
    private String text;
  /*  @Column(name = "picture")
    private String picture;

    @Column(name = "audio")
    private String audio;

    @Column(name = "video")
    private  String video;*/

    @Column(name = "data")
    private String dateCreated;

   /* @JoinColumn(name = "idUser", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private users idUser;*/

    //public Article(){}

   /* public Article(String text, String picture, String audio, String video, String dateCreated){
        this.text = text;
        this.picture = picture;
        this.audio = audio;
        this.video = video;
        this.dateCreated = dateCreated;
    }*/

    public Integer getArticleId() {
        return articleId;
    }

   public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

  /*  public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;*/
   // }

   /* public users getIdUser() {
        return idUser;
    }

    public void setIdUser(users idUser) {
        this.idUser = idUser;
    }*/

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
