package com.wilfred.graphql.graphqltm.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private String id;
    private String title;
    private String text;
    private String category;
    private String authorId;
}
