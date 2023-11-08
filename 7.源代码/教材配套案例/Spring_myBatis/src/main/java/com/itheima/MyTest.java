package com.itheima;

import com.itheima.dao.StudentDao;
import com.itheima.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring-dao.xml");
        StudentDao studentdao =
                context.getBean("studentDao", StudentDao.class);
        int index = 0;
        while (index <= 6) {
            System.out.println("欢迎来到学生管理系统！");
            System.out.println("输入1查询所有学生信息");
            System.out.println("输入2根据id查询学生信息");
            System.out.println("输入3添加学生信息");
            System.out.println("输入4修改学生信息");
            System.out.println("输入5删除学生信息");
            System.out.println("输入6退出系统");
            Scanner scanner = new Scanner(System.in);
            index = scanner.nextInt();
            if (index == 1) {
                System.out.println("所有学生的信息如下：");
                //循环打印所有学生信息
                for (Student student : studentdao.selectStudent()) {
                    System.out.println(student);
                }
            } else if (index == 2) {
                System.out.println("请输入需要查找学生的id：");
                //根据学生id查询学生信息
                int id = scanner.nextInt();
                System.out.println(studentdao.findStudentById(id));
            } else if (index == 3) {
                Student student = new Student();
                System.out.println("请输入需要添加学生的姓名：");
                String name = scanner.next();
                System.out.println("请输入需要添加学生的密码：");
                String pas = scanner.next();
                System.out.println("请输入需要添加学生的专业：");
                String course = scanner.next();
                student.setUsername(name);
                student.setPassword(pas);
                student.setCourse(course);
                //调用添加学生信息方法
                studentdao.addStudent(student);
                System.out.println("添加成功");
            } else if (index == 4) {
                Student student1 = new Student();
                System.out.println("请输入需要修改学生的id：");
                int id = scanner.nextInt();
                System.out.println("请输入要修改姓名：");
                String name = scanner.next();
                System.out.println("请输入要修改密码：");
                String pas = scanner.next();
                System.out.println("请输入要修改的专业：");
                String course = scanner.next();
                student1.setId(id);
                student1.setUsername(name);
                student1.setPassword(pas);
                student1.setCourse(course);
                //调用修改学生信息方法
                studentdao.updateStudent(student1);
                System.out.println("修改成功！");
            } else if (index == 5) {
                System.out.println("请输入需要删除的学生的id：");
                int id = scanner.nextInt();
                //调用删除学生信息方法
                studentdao.deleteStudent(id);
                System.out.println("删除成功！");
            }
        }
        System.out.println("系统退出！");
    }
}

