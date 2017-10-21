package com.yy.xunuan.task;

import com.yy.xunuan.db.gen.model.XhFakeUser;
import com.yy.xunuan.service.FakeUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Administrator on 2017/10/21.
 */

public class Main {
    public static void main(String args[]){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:/spring/appContext.xml");
        FakeUserService fakeUserService=(FakeUserService)applicationContext.getBean("fakeUserService");
        XhFakeUser xhFakeUser=fakeUserService.selectByPrimaryKey(1313212069L);
        System.out.println(xhFakeUser.getName());
    }
}
