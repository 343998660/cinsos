package com.cinsos.controller;

import com.cinsos.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    User user=new User();
    //登录后直接返回登录页面
    @GetMapping("/")
    public String login(){
        return "login";
    }
    //判断是否登录成功
    @ResponseBody
    @PostMapping("/login")
    public  String loginIn(@RequestParam Map<String,String> map , HttpSession session){
        String userName=map.get("userName");
        String passWord=map.get("passWord");
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String ph = "^[1][3578]\\d{9}$";
        return null;
    }
}
