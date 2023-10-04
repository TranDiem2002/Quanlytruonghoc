package com.studentManagement.studentmanagement.Controller;

import com.studentManagement.studentmanagement.Entity.Student;
import com.studentManagement.studentmanagement.Entity.Teacher;
import com.studentManagement.studentmanagement.Service.StudentService;
import com.studentManagement.studentmanagement.Service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeacherController {

    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers")
    public String listTeacher(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "teachers";
    }
    @GetMapping("/teachers/new")
    public String createTeacherForm(Model model) {
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "create_teacher";
    }

    @PostMapping("/teachers")
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
       teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }

}
