package com.SofttechBootcamp.Assignment3.Comment.Controller;

import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentDto;
import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentProductResponseDto;
import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentSaveDto;
import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentUserResponseDto;
import com.SofttechBootcamp.Assignment3.Comment.Service.Com_CommentService;
import com.SofttechBootcamp.Assignment3.Gen.Dto.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class Com_CommentController {
    private final Com_CommentService comCommentService;

     @PostMapping
     public ResponseEntity saveComment(@RequestBody Com_CommentSaveDto comCommentSaveDto){
         Com_CommentDto comCommentDto = comCommentService.saveComment(comCommentSaveDto);
         return ResponseEntity.ok(RestResponse.of(comCommentDto));
     }

     @GetMapping("/commentsOfUser/{userId}")
     public ResponseEntity getCommentByUserId(@PathVariable Long userId){
         List<Com_CommentUserResponseDto> comCommentUserResponseDto = comCommentService.findByUserId(userId);
         return ResponseEntity.ok(RestResponse.of(comCommentUserResponseDto));
     }

     @GetMapping("/commentsOfProduct/{productId}")
    public ResponseEntity getCommentByProductId(@PathVariable Long productId){
         List<Com_CommentProductResponseDto> comCommentProductResponseDto = comCommentService.findByProductId(productId);
         return ResponseEntity.ok(RestResponse.of(comCommentProductResponseDto));
     }

     @DeleteMapping("/{id}")
     public ResponseEntity deleteComment(@PathVariable Long id){
         comCommentService.deleteComment(id);
         return ResponseEntity.ok(RestResponse.empty());
     }

}
