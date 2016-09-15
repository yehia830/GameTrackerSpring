package com.tiy;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Yehia830 on 9/15/16.
 */
public interface GameRepository extends CrudRepository<Game, Integer> {
    List<Game> findByGenre(String genre);
    List<Game> findByReleaseYear(int year);

    @Query("SELECT g FROM Game g WHERE g.name LIKE ?1%")
    List<Game> findByNameStartsWith(String name);


    List<Game> findByUser(User user);
}
