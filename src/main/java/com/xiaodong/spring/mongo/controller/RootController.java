package com.xiaodong.spring.mongo.controller;

import com.xiaodong.spring.mongo.model.User;
import com.xiaodong.spring.mongo.service.MongoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: lixiaodong@souyidai.com
 * @CreateDate: 2016/8/9
 */
@Controller
@RequestMapping
public class RootController {

    private static final Logger LOG = LoggerFactory.getLogger(RootController.class);

    @Autowired
    private MongoService mongoService;

    @RequestMapping("insert.do")
    @ResponseBody
    public String insert(User user) {
        LOG.info("insert参数={}", user);
        try {
            mongoService.insert(user);
            return "ok";
        } catch (Exception e) {
            LOG.error("",e);
            return "error:"+e.getMessage();
        }
    }

    @RequestMapping("save.do")
    @ResponseBody
    public String save(User user) {
        LOG.info("save参数={}",user);
        try {
            mongoService.save(user);
            return "ok";
        } catch (Exception e) {
            LOG.error("",e);
            return "error:"+e.getMessage();
        }
    }
}
