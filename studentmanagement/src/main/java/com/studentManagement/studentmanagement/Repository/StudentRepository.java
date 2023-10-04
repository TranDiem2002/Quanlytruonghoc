package com.studentManagement.studentmanagement.Repository;

import com.studentManagement.studentmanagement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
