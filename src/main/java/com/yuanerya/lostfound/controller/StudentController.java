package com.yuanerya.lostfound.controller;

import com.yuanerya.lostfound.domain.Student;
import com.yuanerya.lostfound.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 用于注册
     * @param studentNo 学号
     * @param studentPassword 登录密码
     * @param institute 学院
     * @param grade 年纪
     * @param classbj 班级
     * @param name 姓名
     * @param request
     * @return
     */
    public String register(@RequestParam("studentNo")String studentNo, @RequestParam("studentPassword")String studentPassword,
                           @RequestParam("institute")String institute, @RequestParam("grade")String grade,
                           @RequestParam("classbj")String classbj, @RequestParam("name")String name,
                           HttpServletRequest request){
        Student student = new Student();
        student.setStudentNo(studentNo);
        student.setStudentPassword(studentPassword);
        student.setInstitute(institute);
        student.setGrade(grade);
        student.setClassbj(classbj);
        student.setName(name);
        if(studentService.save(student)){
            request.getSession().setAttribute("session_student",student);

            return "welcome";
        }else{return "注册失败";}
    }


    @RequestMapping("/loginStudent")
    public String login(@RequestParam("studentNo")String studentNo, @RequestParam("studentPassword")String studentPassword,
                        HttpServletRequest request){
        Student student = new Student();
        student.setStudentNo(studentNo);
        student.setStudentPassword(studentPassword);
        Student student2=studentService.login(student);
        if(student2==null){
            return "用户名或密码错误";
        }else{
            request.getSession().setAttribute("session_student",student);//登录成功后将用户放入session中，用于拦截
            return "welcome";
        }
    }


}
