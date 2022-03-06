package com.SofttechBootcamp.Assignment3.Comment.Model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COM_COMMENT")
@Getter
@Setter
public class Com_Comment {

    @Id
    @SequenceGenerator(name = "Com_Comment", sequenceName = "COM_COMMENT_ID_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "Com_Comment")
    private long Id;

    @Column(name = "COMMENT_CONTENT", length = 250, nullable = false)
    private String commentContent;

    @Column(name = "ID_USER", nullable = false)
    private long userId;

    @Column(name = "ID_PRODUCT", nullable = false)
    private long productId;
}
