package com.itheima.dao;

import com.itheima.entity.Student;

import java.util.List;

public interface StudentDao {
    //添加学生
    Integer addStudent(Student student);

    //更新学生
    Integer updateStudent(Student student);

    //删除学生
    Integer deleteStudent(int id);

    //通过id查询学生
    Student findStudentById(int id);

    //查询所有学生
    List<Student> selectStudent();
}

