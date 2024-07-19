package com.advjava.testcenterform.controller;

import com.advjava.testcenterform.model.Student;
import com.advjava.testcenterform.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/signin")
    public String showSignInForm(Model model) {
        model.addAttribute("student", new Student());
        return "signin";
    }

    @PostMapping("/signin")
    public String signInStudent(@ModelAttribute Student student) {
        studentRepository.save(student);
        return "redirect:/signin";
    }
}