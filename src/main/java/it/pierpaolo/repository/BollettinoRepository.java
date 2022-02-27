package it.pierpaolo.repository;

import it.pierpaolo.entity.Bollettino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BollettinoRepository extends JpaRepository<Bollettino, Integer> {
}
