package com.yuanerya.lostfound.controller;

import com.yuanerya.lostfound.domain.Student;
import com.yuanerya.lostfound.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;




    //跳转到登录页面
    @RequestMapping("/login")
    public String show(){
        return "login";
    }


    @PostMapping("/loginStudent")
    public String login(@RequestParam("studentNo")String studentNo, @RequestParam("studentPassword")String studentPassword,
                        HttpServletRequest request){
        Student student = new Student();
        student.setStudentNo(studentNo);
        student.setStudentPassword(studentPassword);
        Student student2=studentService.login(student);
        if(student2==null){
            //登录失败返回登录页
            return "login";
        }else{
            request.getSession().setAttribute("session_student",student);//登录成功后将用户放入session中，用于拦截
            //登陆成功前往主页面
            return "main";
        }
    }


    //跳转注册页
    @RequestMapping("/register")
    public String toRegister(){
        return "register";
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

            return "login";
        }else{return "注册失败";}
    }


    //测试未登陆拦截页面,进入主页面
    @RequestMapping("/main")
    public String welcome(){
        return "main";
    }

}
