package com.xiaodong.spring.mongo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.AfterSaveEvent;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: lixiaodong@souyidai.com
 * @CreateDate: 2016/8/9
 */
@Service
public class MongoListener extends AbstractMongoEventListener {

    private static final Logger LOG = LoggerFactory.getLogger(MongoListener.class);

    @Override
    public void onAfterSave(AfterSaveEvent event) {
        LOG.info("onAfterSave = {}{}",event.getSource(), event.getDBObject());
    }
}
