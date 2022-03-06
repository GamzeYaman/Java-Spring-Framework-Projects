package com.SofttechBootcamp.Assignment3.Comment.Service.EntityService;


import com.SofttechBootcamp.Assignment3.Comment.Dao.Com_CommentDao;
import com.SofttechBootcamp.Assignment3.Comment.Model.Com_Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
@RequiredArgsConstructor
public class Com_CommentEntityService {
    private final Com_CommentDao comCommentDao;

    //post
    public Com_Comment save(Com_Comment comComment){
        return comCommentDao.save(comComment);
    }

    //get by user ıd
    public List<Com_Comment> findByUserId(Long id){
        return comCommentDao.findByUserId(id);
    }

    //get by product ıd
    public List<Com_Comment> findByProductId(Long id){
        return comCommentDao.findByProductId(id);
    }

    //delete
    public void delete(Long id){
        Com_Comment comComment = getIdWithControl(id);
        comCommentDao.delete(comComment);
    }


    //ıd control
    public Com_Comment getIdWithControl(Long id){
        Optional<Com_Comment> comCommentOptional = comCommentDao.findById(id);

        Com_Comment comComment;
        if(comCommentOptional.isPresent()){
            comComment = comCommentOptional.get();
        }else{
            throw new RuntimeException("Comment cannot found!");
        }

        return  comComment;
    }

}
