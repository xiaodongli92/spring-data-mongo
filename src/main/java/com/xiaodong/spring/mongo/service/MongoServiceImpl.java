package com.xiaodong.spring.mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: lixiaodong@souyidai.com
 * @CreateDate: 2016/8/9
 */
@Service
public class MongoServiceImpl implements MongoService {

    @Autowired
    private MongoTemplate template;

    @Override
    public void insert(Object object) {
        template.insert(object);
    }

    @Override
    public void save(Object object) {
        template.save(object);
    }
}
