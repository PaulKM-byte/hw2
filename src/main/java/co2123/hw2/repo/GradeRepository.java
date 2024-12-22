package co2123.hw2.repo;

import co2123.hw2.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
    List<Grade> findByScore(int score); // Find grades by score
}