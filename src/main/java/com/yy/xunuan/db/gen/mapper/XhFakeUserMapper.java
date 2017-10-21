package com.yy.xunuan.db.gen.mapper;

import com.yy.xunuan.db.gen.model.XhFakeUser;
import com.yy.xunuan.db.gen.model.XhFakeUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XhFakeUserMapper {
    int countByExample(XhFakeUserExample example);

    int deleteByExample(XhFakeUserExample example);

    int deleteByPrimaryKey(Long fakeUid);

    int insert(XhFakeUser record);

    int insertSelective(XhFakeUser record);

    List<XhFakeUser> selectByExample(XhFakeUserExample example);

    XhFakeUser selectByPrimaryKey(Long fakeUid);

    int updateByExampleSelective(@Param("record") XhFakeUser record, @Param("example") XhFakeUserExample example);

    int updateByExample(@Param("record") XhFakeUser record, @Param("example") XhFakeUserExample example);

    int updateByPrimaryKeySelective(XhFakeUser record);

    int updateByPrimaryKey(XhFakeUser record);
}