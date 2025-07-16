package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.SwiperMapper;
import com.tencent.wxcloudrun.dto.SwiperRequest;
import com.tencent.wxcloudrun.model.Swiper;
import com.tencent.wxcloudrun.service.SwiperService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwiperServiceImpl implements SwiperService {
    final SwiperMapper swiperMapper;

    public SwiperServiceImpl(SwiperMapper swiperMapper) {
        this.swiperMapper = swiperMapper;
    }

    @Override
    public List<Swiper> getSwiper(SwiperRequest swiperRequest) {
        Swiper swiper = new Swiper();
        swiper.setId(swiperRequest.getId());
        swiper.setType(swiperRequest.getType());

        return swiperMapper.getSwiper(swiper);
    }
}
