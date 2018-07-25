package com.sun.convert;

import com.sun.convert.VO.ConvertVO;
import com.sun.convert.bean.Convertrate;
import com.sun.convert.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/24.
 */
@RestController
public class ChangeController {

    @Autowired
    private ConvertService convertService;

    /*
    * 汇率转换
    * */
    @GetMapping("/conert/{from}/{to}")
    public ConvertVO convert(@PathVariable("from")String from, @PathVariable("to")String to, @RequestParam("amount")double amount){
        Map<String, Object> map = new HashMap<>();
        map.put("from",from);
        map.put("to",to);
        map.put("amount",amount);
        ConvertVO convertVO = convertService.getChangeRate(map);
        return convertVO;
    }

}
