package co2123.hw2.controller;

import co2123.hw2.repo.GradeRepository;
import co2123.hw2.repo.PupilRepository;
import co2123.hw2.repo.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private PupilRepository pupilRepository;

    @Autowired
    private GradeRepository gradeRepository;

    @GetMapping("/listSchool")
    public String listSchool(Model model) {
        model.addAttribute("data", schoolRepository.findAll());
        return "list";
    }

    @GetMapping("/listPupil")
    public String listPupil(Model model) {
        model.addAttribute("data", pupilRepository.findAll());
        return "list";
    }

    @GetMapping("/listGrade")
    public String listGrade(Model model) {
        model.addAttribute("data", gradeRepository.findAll());
        return "list";
    }
}
