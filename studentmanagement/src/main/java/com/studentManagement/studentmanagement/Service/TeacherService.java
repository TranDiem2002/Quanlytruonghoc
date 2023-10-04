package com.studentManagement.studentmanagement.Service;

import com.studentManagement.studentmanagement.Entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher saveTeacher(Teacher teacher);
}
