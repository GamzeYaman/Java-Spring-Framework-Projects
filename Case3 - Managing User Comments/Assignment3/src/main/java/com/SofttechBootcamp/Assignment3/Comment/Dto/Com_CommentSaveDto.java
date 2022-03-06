package com.SofttechBootcamp.Assignment3.Comment.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Com_CommentSaveDto {
    private String commentContent;
    private long userId;
    private long productId;
}
