package com.sjd.model;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * TabOrder
 * @author sunjidong 2021-11-05
 */
@Table(name="tab_order")
@Data
//添加支持链式调用
@Accessors(chain = true)
public class TabOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id  
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * user_id  
     */
    private Long userId;

    /**
     * product_id  
     */
    private Long productId;

    /**
     * count  
     */
    private Integer count;

    /**
     * money  
     */
    private BigDecimal money;

    /**
     * status  
     */
    private Integer status;
}