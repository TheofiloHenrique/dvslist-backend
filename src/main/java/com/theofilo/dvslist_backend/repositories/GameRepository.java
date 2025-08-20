package com.theofilo.dvslist_backend.repositories;

import com.theofilo.dvslist_backend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
