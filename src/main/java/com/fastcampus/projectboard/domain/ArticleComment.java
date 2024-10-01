package com.fastcampus.projectboard.domain;


import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleComment {


    private Long id;  // 댓글 식별자

    private Long articleId; // 게시글 식별자

    private String content; // 댓글 내용

    private LocalDateTime createdAt; // 생성일시

    private String createdBy; // 생성자

    private LocalDateTime modifiedAt; // 수정일시

    private String modifiedBy; // 수정자
}
