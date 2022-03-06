package com.SofttechBootcamp.Assignment3.Comment.Dao;

import com.SofttechBootcamp.Assignment3.Comment.Model.Com_Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Com_CommentDao extends JpaRepository<Com_Comment, Long> {
    Optional<Com_Comment> findById(Long id);
    List<Com_Comment> findByUserId(Long id);
    List<Com_Comment> findByProductId(Long id);
}
