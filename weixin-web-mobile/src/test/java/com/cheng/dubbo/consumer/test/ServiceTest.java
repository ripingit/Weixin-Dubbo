package com.cheng.dubbo.consumer.test;

import com.alibaba.fastjson.JSON;
import com.cheng.weixin.web.mobile.result.index.Index;
import com.cheng.weixin.web.mobile.result.order.SubmitOrderInfo;
import com.cheng.weixin.web.mobile.service.SysIndexService;
import com.cheng.weixin.web.mobile.service.SysOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Desc:
 * Author: hp
 * Date: 2016/10/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-dubbo-consumer.xml",
        "classpath*:applicationContext.xml"})
public class ServiceTest {
    @Autowired
    private SysIndexService sysIndexService;
    @Autowired
    private SysOrderService orderService;


    @Test
    public void test01() {
        Index index = sysIndexService.getIndexInfo("1");
        System.out.println(JSON.toJSONString(index));
    }

    @Test
    public void test02() {
        SubmitOrderInfo info = orderService.buy();
        System.out.println(JSON.toJSONString(info));
    }
}
