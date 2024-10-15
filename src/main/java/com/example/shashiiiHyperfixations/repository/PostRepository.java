package com.example.shashiiiHyperfixations.repository;

import com.example.shashiiiHyperfixations.model.Post;
import com.example.shashiiiHyperfixations.model.PrivacySetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // This tells Spring to bootstrap the repository during component scan, what is component scan?
// Component scan is the process where Spring scans the project for classes annotated with @Component, @Service, @Repository, and @Controller annotations.
// Spring then registers the classes as beans in the application context, making them available for dependency injection.
// The @Repository annotation is a specialization of the @Component annotation with similar use and functionality.
// what is a spring bean? A Spring bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. i dont understand
// what is a spring IoC container? The Spring IoC container is the core of the Spring Framework. It creates the objects, wires them together,
// configures them, and manages their complete life cycle from creation till destruction.
// explain simple, i dont understand. The Spring IoC container is responsible for instantiating, configuring, and assembling objects known as beans, as well as
// managing their lifecycle. The container uses dependency injection to manage the components that make up an application.
public interface PostRepository extends JpaRepository<Post, Long> {

    // This method is used to find all posts with a specific privacy setting. Where does it look for the posts? and ehy?

}
