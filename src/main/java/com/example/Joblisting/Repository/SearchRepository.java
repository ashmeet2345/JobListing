package com.example.Joblisting.Repository;

import com.example.Joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
