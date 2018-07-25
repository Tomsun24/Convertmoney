package com.sun.convert.mapper;

import com.sun.convert.bean.Convertrate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConvertRateMapperTest {


    @Autowired
    private ConvertRateMapper mapper;

    @Test
    public void testFindChangeRate(){
        Map<String, Object> map = new HashMap<>();
        map.put("from","USA");
        map.put("to","CH");
        Convertrate changeRate = mapper.findChangeRate(map);
        System.out.print(changeRate.getRate());


    }


}