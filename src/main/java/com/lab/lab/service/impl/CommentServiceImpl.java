package com.lab.lab.service.impl;

import com.lab.lab.dto.CommentDto;
import com.lab.lab.repo.CommentRepo;
import com.lab.lab.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Override
    public void addComment(CommentDto commentDto) {
//        commentRepo.save(commentDto)
    }
}
