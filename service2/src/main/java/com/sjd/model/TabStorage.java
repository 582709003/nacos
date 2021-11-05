package com.sjd.model;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * TabStorage
 * @author sunjidong 2021-11-05
 */
@Table(name="tab_storage")
@Data
//添加支持链式调用
@Accessors(chain = true)
public class TabStorage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id  
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * product_id  
     */
    private Long productId;

    /**
     * total  
     */
    private Integer total;

    /**
     * used  
     */
    private Integer used;
}