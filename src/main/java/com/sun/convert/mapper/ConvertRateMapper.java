package com.sun.convert.mapper;

import com.sun.convert.bean.Convertrate;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * Created by Administrator on 2018/7/24.
 */
public interface ConvertRateMapper {

    @Select("select rate ,from_country,to_country  from convertrate  where from_country=#{from} and to_country = #{to}")
    @Results({
            @Result(column ="rate" , property = "rate"),
            @Result(column ="from_country" , property = "from"),
            @Result(column ="to_country" , property = "to"),
    })
    Convertrate findChangeRate(Map<String,Object> map);
}
