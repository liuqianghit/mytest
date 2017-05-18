package com.lq.test.controller;

import com.lq.test.serviceImpl.LoginServiceImpl;
import com.lq.test.vo.ResultVO;
import com.lq.test.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/5/18 0018.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginServiceImpl service;

    @RequestMapping("/dolog")
    public String login(Model model,Student student){
        ResultVO result = service.logService(student);
        model.addAttribute("result",result);
        model.addAttribute("name",student.getName());
        if("000".equals(result.getCode()))
            return "success";
        else
            return "wrong";
    }
}
