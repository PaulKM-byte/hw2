package co2123.hw2.controller;

import co2123.hw2.repo.GradeRepository;
import co2123.hw2.repo.PupilRepository;
import co2123.hw2.repo.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private PupilRepository pupilRepository;

    @Autowired
    private GradeRepository gradeRepository;

    @GetMapping("/deleteSchool")
    public String deleteSchool(@RequestParam("id") int id) {
        schoolRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/deletePupil")
    public String deletePupil(@RequestParam("address") String address) {
        pupilRepository.deleteById(address);
        return "redirect:/";
    }

    @GetMapping("/deleteGrade")
    public String deleteGrade(@RequestParam("identifier") int identifier) {
        gradeRepository.deleteById(identifier);
        return "redirect:/";
    }
}
