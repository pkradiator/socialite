package com.socialite.backend.repository;

import com.socialite.backend.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {

    Optional<Subreddit> findByName(String subredditName);
}
