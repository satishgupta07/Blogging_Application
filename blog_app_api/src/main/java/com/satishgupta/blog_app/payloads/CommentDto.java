package com.satishgupta.blog_app.payloads;

import com.satishgupta.blog_app.entities.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CommentDto {
    private int id;
    private String content;
}
