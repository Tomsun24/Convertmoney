package com.sun.convert.VO;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/7/25.
 */
@Data
public class ConvertVO {
    //装换之后的总数
    private BigDecimal amount;
    //汇率
    private BigDecimal rate;
    //来源国家
    private String from;
    //转换国家
    private String to;
}
