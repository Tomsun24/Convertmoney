package com.sun.convert.service.impl;

import com.sun.convert.vo.ConvertVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConvertServiceImplTest {
    @Autowired
    private ConvertServiceImpl convertService;

    @Test
    public void getChangeRate() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("from","USA");
        map.put("to","CN");
        map.put("amount",2.0);
        ConvertVO convertVO = convertService.getChangeRate(map);
        Assert.assertNotNull(convertVO);

    }

}