package com.tpe.repository;

import com.tpe.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

    // normalde burada HQL, JPQL veya NATIVE SQL yaziyorduk

    @Procedure(procedureName = "getCount")
    // yukun bir kismini DB tarafina atmis oluyoruz, uygulama rahatliyor!
    String getFilmCount();
}
    // kullanilan trigger diye bir yapi daha var! ???

    // out2 authentication => farkli bir security katmani ???