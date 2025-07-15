package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dto.HotRecentlyRequest;
import com.tencent.wxcloudrun.model.HotRecently;

import java.util.List;
import java.util.Optional;

public interface HotRecentlyService {

    List<HotRecently> getHotRecently(HotRecentlyRequest recentlyRequest);

}
