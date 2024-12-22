package co2123.hw2;

import co2123.hw2.model.Grade;
import co2123.hw2.model.Pupil;
import co2123.hw2.model.School;
import co2123.hw2.repo.GradeRepository;
import co2123.hw2.repo.PupilRepository;
import co2123.hw2.repo.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Hw2Application implements CommandLineRunner {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private PupilRepository pupilRepository;

    @Autowired
    private GradeRepository gradeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }

    @Override
    public void run(String... args) {
        // Create Grades
        Grade grade1 = new Grade();
        grade1.setScore(85);
        gradeRepository.save(grade1);

        Grade grade2 = new Grade();
        grade2.setScore(92);
        gradeRepository.save(grade2);

        // Create Pupils
        Pupil pupil1 = new Pupil();
        pupil1.setAddress("123 Main St");
        pupil1.setGrades(Arrays.asList(grade1, grade2));
        pupil1.setBest(grade2);
        pupilRepository.save(pupil1);

        // Create Schools
        School school1 = new School();
        school1.setName("Springfield High");
        school1.setPupils(Arrays.asList(pupil1));
        school1.setRepresentative(pupil1);
        schoolRepository.save(school1);
    }
}
