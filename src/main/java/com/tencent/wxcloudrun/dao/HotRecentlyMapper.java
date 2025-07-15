package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.HotRecently;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HotRecentlyMapper {
    HotRecently getHotRecently(HotRecently hotRecently);
}
