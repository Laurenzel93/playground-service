package com.laurenzel.playgroundservice.repositories;

import com.laurenzel.playgroundservice.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnimeRepository extends JpaRepository<Anime, UUID> {
    
}
