package com.cinsos.mapper;
import org.apache.ibatis.annotations.*;
//只是一个操作数据库的mapper
public interface UserMapper {

    @DeleteProvider(type = BatchUser.class, method = "batchDelUsers")
    int batStuDel(String oid);
    ;
}