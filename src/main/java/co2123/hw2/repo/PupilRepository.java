package co2123.hw2.repo;

import co2123.hw2.model.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PupilRepository extends JpaRepository<Pupil, String> {
    List<Pupil> findByAddress(String address); // Find pupils by address
}
