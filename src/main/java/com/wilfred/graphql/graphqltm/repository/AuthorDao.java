package com.wilfred.graphql.graphqltm.repository;

import com.wilfred.graphql.graphqltm.models.Author;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AuthorDao {
    private final List<Author> authors;

    public AuthorDao(List<Author> authors) {
        this.authors = authors;
    }

    public Author getAuthor(String id) {
        return authors.stream()
                .filter(author -> id.equals(author.getId()))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
