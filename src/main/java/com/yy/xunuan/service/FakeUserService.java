package com.yy.xunuan.service;

import com.yy.xunuan.db.gen.model.XhFakeUser;

/**
 * Created by Administrator on 2017/10/21.
 */
public interface FakeUserService {
    XhFakeUser selectByPrimaryKey(Long fakeUid);
}
