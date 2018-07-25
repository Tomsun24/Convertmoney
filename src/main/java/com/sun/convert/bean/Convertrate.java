package com.sun.convert.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/7/24.
 */
@Data
public class Convertrate {
    //汇率
    private BigDecimal rate;
    //来源国家
    private String from;
    //转换国家
    private String to;

}
