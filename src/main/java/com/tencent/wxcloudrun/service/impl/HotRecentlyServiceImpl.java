package com.tencent.wxcloudrun.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.tencent.wxcloudrun.dao.HotRecentlyMapper;
import com.tencent.wxcloudrun.dto.HotRecentlyRequest;
import com.tencent.wxcloudrun.model.HotRecently;
import com.tencent.wxcloudrun.service.HotRecentlyService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class HotRecentlyServiceImpl implements HotRecentlyService {
    final HotRecentlyMapper hotRecentlyMapper;

    public HotRecentlyServiceImpl(HotRecentlyMapper hotRecentlyMapper) {
        this.hotRecentlyMapper = hotRecentlyMapper;
    }

    @Override
    public Optional<HotRecently> getHotRecently(HotRecentlyRequest recentlyRequest) {
        HotRecently hotRecently = new HotRecently();
        hotRecently.setId(recentlyRequest.getId());
        hotRecently.setName(recentlyRequest.getName());
        hotRecently.setSub(recentlyRequest.getSub());
        hotRecently.setPrice(recentlyRequest.getPrice());
        hotRecently.setScore(recentlyRequest.getScore());
        return Optional.ofNullable(hotRecentlyMapper.getHotRecently(hotRecently));

    }
}
