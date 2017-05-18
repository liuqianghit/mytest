package com.lq.test.daoImpl;

import com.lq.test.dao.LoginDao;
import com.lq.test.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/5/18 0018.
 */
@Repository
public class LoginDaoImpl implements LoginDao{
    @Autowired
    private Student student;
    public Student getStudent(String username) {
        if(username == null)
            return null;
        if(username.equals(student.getUsername()))
            return student;
        else
            return null;
    }
}
