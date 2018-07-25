package com.sun.convert.service;

import com.sun.convert.vo.ConvertVO;

import java.util.Map;

/**
 * Created by Administrator on 2018/7/24.
 */
public interface ConvertService {


    /*
    * 汇率转换
    * */
    public ConvertVO getChangeRate(Map<String,Object> map);

}
