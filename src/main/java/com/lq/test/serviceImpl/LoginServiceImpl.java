package com.lq.test.serviceImpl;

import com.lq.test.dao.LoginDao;
import com.lq.test.service.LoginService;
import com.lq.test.vo.ResultVO;
import com.lq.test.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/18 0018.
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao dao;

    public ResultVO logService(Student student){
        if(student == null)
            return ResultVO.DATA_WRONG;
        Student s = dao.getStudent(student.getUsername());
        if(s == null)
            return ResultVO.NO_USER;
        else if (s.getPassword().equals(student.getPassword())) {
            student.setName(s.getName());
            return ResultVO.SUCCESS;
        }
        else
            return ResultVO.PASSWORD_WRONG;
    }
}
