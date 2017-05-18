package com.lq.test.vo;

/**
 * Created by Administrator on 2017/5/18 0018.
 */
public enum  ResultVO {
    DATA_WRONG("001","学生登录信息错误"),SUCCESS("000","登陆成功"),PASSWORD_WRONG("002","密码错误"),NO_USER("003","用户名错误");
    private String code;
    private String msg;

    ResultVO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
