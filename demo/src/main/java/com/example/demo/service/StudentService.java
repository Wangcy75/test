package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//接收controller层的信息，用于业务处理和逻辑判断，对mapper/repository层的数据进行组装处理，将结果返回给controller层
//业务service层，给controller层的类提供接口进行调用。一般就是自己写的方法封装起来，就是声明一下，具体实现在serviceImpl中。
@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> findAllStudent() {

        return repo.findAll();
    }

    public void saveStudent(Student student) {

        repo.save(student);
    }

    public Student findStudentById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteStudentById(Integer id) {
        repo.deleteById(id);
    }

}
