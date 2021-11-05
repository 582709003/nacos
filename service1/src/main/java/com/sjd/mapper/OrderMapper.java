package com.sjd.mapper;

import com.sjd.model.TabOrder;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author xinao
 * @projectname nacos
 * @create 2021/11/5
 */
@Repository
public interface OrderMapper extends Mapper<TabOrder> {
}
