package com.lab.lab.service.impl;

import com.lab.lab.Util.Mapper;
import com.lab.lab.dto.CommentDto;
import com.lab.lab.dto.PostDto;
import com.lab.lab.repo.CommentRepo;
import com.lab.lab.repo.PostRepo;
import com.lab.lab.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;
    @Autowired
    PostRepo postRepo;

    @Override
    public void addComment(CommentDto commentDto) {
        var post = postRepo.findById(commentDto.getPostId());
        if (post.isPresent())
            commentRepo.save(Mapper.convertCommentDtoToComment(commentDto, post.get()));
    }
}
