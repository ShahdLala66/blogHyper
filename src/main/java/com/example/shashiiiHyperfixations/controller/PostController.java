package com.example.shashiiiHyperfixations.controller;

import com.example.shashiiiHyperfixations.model.Post;
import com.example.shashiiiHyperfixations.model.PrivacySetting;
import com.example.shashiiiHyperfixations.repository.PostRepository;
import com.example.shashiiiHyperfixations.user.User;
import com.example.shashiiiHyperfixations.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<Post> getPostsForUser() {
        System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOOO");
            return postRepository.findAll();
    }

    @PostMapping ("/create")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post savedPost = postRepository.save(post);
        return ResponseEntity.ok(savedPost);
    }
}
