package com.example.demo.studentinterface;


import tk.mybatis.mapper.common.MySqlMapper;

public interface Mstudent<T> extends MySqlMapper<T>,mapper<T> {

}
