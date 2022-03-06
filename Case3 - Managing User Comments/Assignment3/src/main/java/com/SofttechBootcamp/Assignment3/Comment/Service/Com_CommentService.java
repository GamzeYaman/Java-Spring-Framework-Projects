package com.SofttechBootcamp.Assignment3.Comment.Service;

import com.SofttechBootcamp.Assignment3.Comment.Converter.Com_CommentMapperConverter;
import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentDto;
import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentProductResponseDto;
import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentSaveDto;
import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentUserResponseDto;
import com.SofttechBootcamp.Assignment3.Comment.Model.Com_Comment;
import com.SofttechBootcamp.Assignment3.Comment.Service.EntityService.Com_CommentEntityService;
import com.SofttechBootcamp.Assignment3.Product.Model.Pro_Product;
import com.SofttechBootcamp.Assignment3.Product.Service.EntityService.Pro_ProductEntityService;
import com.SofttechBootcamp.Assignment3.User.Model.Us_User;
import com.SofttechBootcamp.Assignment3.User.Service.EntityService.Us_UserEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Com_CommentService {
    private final Com_CommentEntityService comCommentEntityService;
    private final Us_UserEntityService usUserEntityService;
    private final Pro_ProductEntityService pro_productEntityService;


    public Com_CommentDto saveComment(Com_CommentSaveDto comCommentSaveDto){
        Com_Comment comComment = Com_CommentMapperConverter.INSTANCE.convertToComCommentFromComCommentDto(comCommentSaveDto);
        comComment = comCommentEntityService.save(comComment);

        Com_CommentDto comCommentDto = Com_CommentMapperConverter.INSTANCE.convertToComCommentDtoFromComComment(comComment);
        return comCommentDto;
    }

    /* Getting user's comment with controlling its id and having comment. If it hasn't wrote any comment, so throw an exception. */
    public List<Com_CommentUserResponseDto> findByUserId(Long id){
        List<Com_Comment> comCommentList = comCommentEntityService.findByUserId(id);
        Us_User user = usUserEntityService.getIdWithControl(id);

        List<Com_CommentUserResponseDto> comCommentUserResponseDtoList;
        if(!comCommentList.isEmpty()){
            comCommentUserResponseDtoList = Com_CommentMapperConverter.INSTANCE.convertToComCommentUserResponseDtoList(comCommentList);
        }else{
            throw new RuntimeException("Username called " + user.getUserName() + " hasn't wrote any comment yet!");
        }
        return comCommentUserResponseDtoList;
    }


    /* Getting product's comment with controlling its id and having comment. If it hasn't comment, so throw an exception. */
    public List<Com_CommentProductResponseDto> findByProductId(Long id){
       List<Com_Comment>  comCommentList = comCommentEntityService.findByProductId(id);
       Pro_Product product = pro_productEntityService.getIdWithControl(id);

       List<Com_CommentProductResponseDto> comCommentProductResponseDtoList;
        if(!comCommentList.isEmpty()){
           comCommentProductResponseDtoList = Com_CommentMapperConverter.INSTANCE.convertToComCommentProductResponseList(comCommentList);
       }else{
            throw new RuntimeException("The product called " + product.getProductName() + " hasn't any comment yet!");
        }

       return comCommentProductResponseDtoList;
    }

    public void deleteComment(Long id){
        comCommentEntityService.delete(id);
    }

}
