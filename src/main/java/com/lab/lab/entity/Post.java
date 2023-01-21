package com.lab.lab.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import com.lab.lab.entity.User;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    String title;
    String content;
    String author;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    List<Comment> comments;

//    public Post(long id, String title, String content, String author, User user) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//        this.author = author;
//        this.user = user;
//    }
}

