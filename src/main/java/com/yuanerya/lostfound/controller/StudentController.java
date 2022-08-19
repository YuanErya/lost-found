package com.yuanerya.lostfound.controller;

import com.yuanerya.lostfound.domain.Student;
import com.yuanerya.lostfound.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@RestController

public class StudentController {
    @Autowired
    private StudentService studentService;



    //跳转到登录页面
    @RequestMapping("/login")
    public ModelAndView show(){
        return new ModelAndView("login");
    }


    @PostMapping("/loginStudent")
    public ModelAndView login(@RequestParam("studentNo")String studentNo, @RequestParam("studentPassword")String studentPassword,
                        HttpServletRequest request){
        Student student = new Student();
        student.setStudentNo(studentNo);
        student.setStudentPassword(studentPassword);
        Student student2=studentService.login(student);
        if(student2==null){
            //登录失败返回登录页
            return new ModelAndView("login");
        }else{
            request.getSession().setAttribute("session_student",student);//登录成功后将用户放入session中，用于拦截
            //登陆成功前往主页面
            return new ModelAndView("main");
        }
    }


    //跳转注册页
    @RequestMapping("/register")
    public ModelAndView toRegister(){
        return new ModelAndView("register");
    }

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
    @PostMapping("/registerStudent")
    public ModelAndView register(@RequestParam("studentNo")String studentNo, @RequestParam("studentPassword")String studentPassword,
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

            return new ModelAndView("main");
        }else{return new ModelAndView("register");}
    }


    //测试未登陆拦截页面,进入主页面
    @RequestMapping("/main")
    public ModelAndView welcome(){
        return new ModelAndView("main");
    }

}
