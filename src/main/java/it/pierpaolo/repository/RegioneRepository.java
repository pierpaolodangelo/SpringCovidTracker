package it.pierpaolo.repository;

import it.pierpaolo.entity.Regione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegioneRepository extends JpaRepository<Regione, Integer> {
}
