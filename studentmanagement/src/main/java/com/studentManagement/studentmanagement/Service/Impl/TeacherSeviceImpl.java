package com.studentManagement.studentmanagement.Service.Impl;

import com.studentManagement.studentmanagement.Entity.Teacher;
import com.studentManagement.studentmanagement.Repository.TeacherRepository;
import com.studentManagement.studentmanagement.Service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherSeviceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherSeviceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher saveTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
}
