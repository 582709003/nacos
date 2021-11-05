package com.sjd.service.impl;/**
 * @projectname nacos
 * @author xinao
 * @create 2021/11/5
 */

import com.sjd.mapper.StorageMapper;
import com.sjd.model.TabStorage;
import com.sjd.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sunjidong
 * @Date 2021/11/5
 * @Describtion
 **/
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    @Transactional
    public boolean reduce() {
        TabStorage storage = new TabStorage();
        storage.setId(1l)
                .setProductId(1l)
                .setTotal(99)
                .setUsed(1);
        return storageMapper.updateByPrimaryKey(storage) > 0;
    }
}
