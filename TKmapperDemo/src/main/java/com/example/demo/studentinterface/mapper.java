package com.example.demo.studentinterface;

import org.apache.logging.log4j.Marker;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.RowBoundsMapper;

public interface mapper<T> extends BaseMapper<T>, ExampleMapper<T>, RowBoundsMapper<T>, Marker {

}
