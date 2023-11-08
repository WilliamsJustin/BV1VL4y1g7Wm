package com.itheima.dao.impl;

import com.itheima.dao.StudentDao;
import com.itheima.entity.Student;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    //实现添加学生信息方法
    public Integer addStudent(Student student) {
        StudentDao mapper = sqlSessionTemplate.getMapper(StudentDao.class);
        return mapper.addStudent(student);
    }

    //实现更新学生信息方法
    public Integer updateStudent(Student student) {
        StudentDao mapper = sqlSessionTemplate.getMapper(StudentDao.class);
        return mapper.updateStudent(student);
    }

    //实现删除学生信息方法
    public Integer deleteStudent(int id) {
        StudentDao mapper = sqlSessionTemplate.getMapper(StudentDao.class);
        return mapper.deleteStudent(id);
    }

    //实现根据id查询学生信息方法
    public Student findStudentById(int id) {
        StudentDao mapper = sqlSessionTemplate.getMapper(StudentDao.class);
        return mapper.findStudentById(id);
    }

    //实现查询所有学生信息方法
    public List<Student> selectStudent() {
        StudentDao mapper = sqlSessionTemplate.getMapper(StudentDao.class);
        return mapper.selectStudent();
    }
}

