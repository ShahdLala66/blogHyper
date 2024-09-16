package com.example.shashiiiHyperfixations.repository;

import com.example.shashiiiHyperfixations.model.Post;
import com.example.shashiiiHyperfixations.model.PrivacySetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByPrivacy(String privacy);
}
