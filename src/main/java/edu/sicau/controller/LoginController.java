package edu.sicau.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.HttpConstraintElement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;
@Controller
public class LoginController {
    @RequestMapping( value = "login_a",method = {RequestMethod.POST} )
    public void doLogin(HttpServletRequest request ,HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.isEmpty()||password.isEmpty()){
            request.getRequestDispatcher("login.html").forward(request,response);
        }else if("yjl".equals(username) && "123".equals(password)){
            response.sendRedirect("b.html");
        }else{
            response.sendRedirect("login.html");
        }
    }
}
