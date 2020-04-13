package kz.srcadb.logistic.repo;

import kz.srcadb.logistic.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepo extends JpaRepository<Model, Long> {
}