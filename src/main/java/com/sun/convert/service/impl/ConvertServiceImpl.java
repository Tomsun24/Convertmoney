package com.sun.convert.service.impl;

import com.sun.convert.vo.ConvertVO;
import com.sun.convert.bean.Convertrate;
import com.sun.convert.mapper.ConvertRateMapper;
import com.sun.convert.service.ConvertService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/24.
 */
@Service
public class ConvertServiceImpl implements ConvertService {

    @Autowired
    private ConvertRateMapper convertRateMapper;

    @Override
    @Transactional
    public ConvertVO getChangeRate(Map<String, Object> map) {
        Convertrate convertrate = convertRateMapper.findChangeRate(map);
        ConvertVO convertVO = new ConvertVO();
        if(convertrate !=null){
            BeanUtils.copyProperties(convertrate,convertVO);
            convertVO.setAmount(new BigDecimal((Double) map.get("amount")).multiply(convertrate.getRate()));
        }
        return convertVO;
    }
}
