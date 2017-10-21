package com.yy.xunuan.service.impl;

import com.yy.xunuan.db.gen.mapper.XhFakeUserMapper;
import com.yy.xunuan.db.gen.model.XhFakeUser;
import com.yy.xunuan.service.FakeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/21.
 */
@Service("fakeUserService")
public class FakeUserServiceImpl implements FakeUserService {
    @Autowired
    XhFakeUserMapper fakeUserMapper;
    public XhFakeUser selectByPrimaryKey(Long fakeUid) {
        return fakeUserMapper.selectByPrimaryKey(fakeUid);
    }
}
