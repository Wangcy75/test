package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//实体层，用于存放我们的实体类，与数据库中的属性值基本保持一致，实现set和get的方法或者使用注解的方式。
@Entity
@Table(name="student")//指定表名
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String number;
    private String phone;
    private String email;

}
