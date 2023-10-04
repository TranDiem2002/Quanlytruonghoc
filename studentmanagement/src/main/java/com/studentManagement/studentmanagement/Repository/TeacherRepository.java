package com.studentManagement.studentmanagement.Repository;

import com.studentManagement.studentmanagement.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
