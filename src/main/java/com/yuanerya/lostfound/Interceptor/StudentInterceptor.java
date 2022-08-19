package com.yuanerya.lostfound.Interceptor;


import com.yuanerya.lostfound.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class StudentInterceptor implements HandlerInterceptor {

    /*
     * 成功拦截则跳转到登陆页面
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        Student student  = (Student) request.getSession().getAttribute("session_student");
        if (student==null){
            response.sendRedirect(request.getContextPath()+"/login");//拦截后跳转的方法
            return false;
        }
        return true;
    }

    /*
     * 处理请求完成后视图渲染之前的处理操作
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
    }

    /*
     * 视图渲染之后的操作
     */
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {
    }

}
