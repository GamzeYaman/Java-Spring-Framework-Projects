package com.SofttechBootcamp.Assignment3.Comment.Converter;

import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentDto;
import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentProductResponseDto;
import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentSaveDto;
import com.SofttechBootcamp.Assignment3.Comment.Dto.Com_CommentUserResponseDto;
import com.SofttechBootcamp.Assignment3.Comment.Model.Com_Comment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper(unmappedTargetPolicy =  ReportingPolicy.IGNORE)
public interface Com_CommentMapperConverter {
    Com_CommentMapperConverter INSTANCE = Mappers.getMapper(Com_CommentMapperConverter.class);
    Com_Comment convertToComCommentFromComCommentDto(Com_CommentSaveDto comCommentSaveDto);
    Com_CommentDto convertToComCommentDtoFromComComment(Com_Comment comComment);
    List<Com_CommentDto> convertToComCommentDtoList(List<Com_Comment> comCommentList);
    List<Com_CommentUserResponseDto> convertToComCommentUserResponseDtoList(List<Com_Comment> comCommentList);
    List<Com_CommentProductResponseDto> convertToComCommentProductResponseList(List<Com_Comment> comCommentList);
}
