package com.cinsos.bean;
import com.cinsos.myutiles.Excel;
import java.util.Date;
import java.util.Objects;
public class User {
    public String getUser_oid() {
        return user_oid;
    }

    public void setUser_oid(String user_oid) {
        this.user_oid = user_oid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_loginName() {
        return user_loginName;
    }

    public void setUser_loginName(String user_loginName) {
        this.user_loginName = user_loginName;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Date getUser_foundTime() {
        return user_foundTime;
    }

    public void setUser_foundTime(Date user_foundTime) {
        this.user_foundTime = user_foundTime;
    }

    public String getUser_salt() {
        return user_salt;
    }

    public void setUser_salt(String user_salt) {
        this.user_salt = user_salt;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_oid='" + user_oid + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_loginName='" + user_loginName + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_type=" + user_type +
                ", user_phone='" + user_phone + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_foundTime=" + user_foundTime +
                ", user_salt='" + user_salt + '\'' +
                '}';
    }

    @Excel(name = "用户唯一编号",width =40)
    private String user_oid;
    @Excel(name = "姓名")
    private String user_name;
    @Excel(name = "账号")
    private String user_loginName;
    @Excel(name = "密码")
    private String user_password;
    @Excel(name = "类型",width =5,type = "int")
    private Integer user_type;
    @Excel(name = "手机号码",type = "int")
    private String user_phone;
    @Excel(name = "邮箱" ,width =20 )
    private String user_email;
    @Excel(name = "创建时间",type = "date")
    private Date user_foundTime;
    @Excel(name="盐值")
    private String user_salt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return user_oid.equals(user.user_oid) &&
                user_name.equals(user.user_name) &&
                user_loginName.equals(user.user_loginName) &&
                user_password.equals(user.user_password) &&
                user_type.equals(user.user_type) &&
                user_phone.equals(user.user_phone) &&
                user_email.equals(user.user_email) &&
                user_foundTime.equals(user.user_foundTime) &&
                user_salt.equals(user.user_salt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_oid, user_name, user_loginName, user_password, user_type, user_phone, user_email, user_foundTime, user_salt);
    }
}
