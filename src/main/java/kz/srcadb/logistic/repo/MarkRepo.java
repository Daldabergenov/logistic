package kz.srcadb.logistic.repo;

import kz.srcadb.logistic.domain.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepo extends JpaRepository<Mark, Long> {
}