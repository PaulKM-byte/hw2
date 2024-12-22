
package co2123.hw2;

import co2123.hw2.model.Grade;
import co2123.hw2.model.Pupil;
import co2123.hw2.model.School;
import co2123.hw2.repo.GradeRepository;
import co2123.hw2.repo.PupilRepository;
import co2123.hw2.repo.SchoolRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Hw2Application {

    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }

    @Bean
    public CommandLineRunner run(SchoolRepository schoolRepo, PupilRepository pupilRepo, GradeRepository gradeRepo) {
        return (args) -> {
            // Create grades
            Grade grade1 = new Grade();
            grade1.setScore(95);

            Grade grade2 = new Grade();
            grade2.setScore(88);

            Grade grade3 = new Grade();
            grade3.setScore(75);

            gradeRepo.saveAll(Arrays.asList(grade1, grade2, grade3));

            // Create pupils
            Pupil pupil1 = new Pupil();
            pupil1.setAddress("123 Main St");
            pupil1.setGrades(Arrays.asList(grade1, grade2));
            pupil1.setBest(grade1);

            Pupil pupil2 = new Pupil();
            pupil2.setAddress("456 Oak Ave");
            pupil2.setGrades(Arrays.asList(grade3));
            pupil2.setBest(grade3);

            pupilRepo.saveAll(Arrays.asList(pupil1, pupil2));

            // Update grades with pupil references
            grade1.setPupil(pupil1);
            grade2.setPupil(pupil1);
            grade3.setPupil(pupil2);

            gradeRepo.saveAll(Arrays.asList(grade1, grade2, grade3));

            // Create schools
            School school1 = new School();
            school1.setName("Greenwood High");
            school1.setPupils(Arrays.asList(pupil1, pupil2));
            school1.setRepresentative(pupil1);

            School school2 = new School();
            school2.setName("Lakeside Academy");
            school2.setPupils(Arrays.asList(pupil2));
            school2.setRepresentative(pupil2);

            schoolRepo.saveAll(Arrays.asList(school1, school2));
        };
    }
}