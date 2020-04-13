package kz.srcadb.logistic.repo;

import kz.srcadb.logistic.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}