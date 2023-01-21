package com.lab.lab.repo;

import com.lab.lab.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {


}
