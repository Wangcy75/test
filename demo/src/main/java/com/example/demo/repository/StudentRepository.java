package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;//增删改查功能，此为一个接口，不必写实现类(Impl)

//调用接口
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
