package co2123.hw2.repo;

import co2123.hw2.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SchoolRepository extends JpaRepository<School, Integer> {
    List<School> findByName(String name); // Find schools by name
    List<School> findByRepresentative_Address(String address); // Find schools by representative's address
}
