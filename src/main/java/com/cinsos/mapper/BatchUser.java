package com.cinsos.mapper;

import com.cinsos.bean.User;
import org.apache.ibatis.jdbc.SQL;

//复杂性SQL
public class BatchUser {
    /*
      批量删除
      oids 所需要删除的oid
     */
    public String batchDelUsers(String oids) {
        String[] oid=oids.split(",");
        StringBuffer sb = new StringBuffer();
        sb.append("delete from cinsos_user where user_oid in (");
        for (int i = 0; i < oid.length; i++) {
            sb.append("'").append(oid[i]).append("'");
            if (i < oid.length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return sb.toString();
    }
    /**条件不确定查询查询语句
     *
     */
    public String batchSelectUser(String string){
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String ph = "^[1][3578]\\d{9}$";
        return new SQL(){{
            SELECT("*");
            FROM("cinsos_user");
            if(string.matches(em)){//邮箱登录
                WHERE("user_email=#{string}");
            }
            if(string.matches(ph)){//手机号码登录
                WHERE("user_phone=#{string}");
            }else {//用户名登录
                WHERE("user_loginName=#{string}");
            }
        }}.toString();
    }

}
