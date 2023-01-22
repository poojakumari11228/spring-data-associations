package com.lab.lab.controller;

import com.lab.lab.dto.CommentDto;
import com.lab.lab.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    private CommentService commentService;

    @Autowired
    CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @PostMapping
    public void addComment(@RequestBody CommentDto commentDto){
        commentService.addComment(commentDto);
    }
}
