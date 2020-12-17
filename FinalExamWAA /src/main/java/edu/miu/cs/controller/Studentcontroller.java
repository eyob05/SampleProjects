package edu.miu.cs.controller;

import edu.miu.cs.model.Student;
import edu.miu.cs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller

public class Studentcontroller {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String newc() {
        return "index";
    }

    @GetMapping("/addnew")
    public String addNew(@ModelAttribute("student") Student student,Model model) {
        model.addAttribute("listcourses",studentService.getAllCourses());
        return "addNew";
    }

    @PostMapping("/save")
    public String saveStudent(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model, RedirectAttributes rd) {

        if (result.hasErrors()) {
            return "addNew";
        }

        Student st = studentService.saveNewStudent(student);
        rd.addFlashAttribute("student", st);
        return "redirect:details";
    }

    @RequestMapping("/details")
    public String SuccessPage() {

        return "success";
    }

    @GetMapping(value = "/getall")
public String getAllStudents( Student student,Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "listOfStudents";
}

}
