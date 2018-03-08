package com.molt.cc.service.impl;

import com.molt.cc.gen.mapper.AdMapper;
import com.molt.cc.gen.model.Ad;
import com.molt.cc.gen.model.AdExample;
import com.molt.cc.service.AdService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdServiceImpl implements AdService {

    @Autowired
    private AdMapper adMapper;

    @Override
    public List<Ad> dataList() {
        AdExample example = new AdExample();
        return adMapper.selectByExample(example);
    }

    @Override
    public Integer insert(Ad ad) {
        return adMapper.insert(ad);
    }

    @Override
    public Integer deletedById(Integer id) {
        System.out.println("AdService[deletedById] id: " + id);
        Integer response =  adMapper.deleteByPrimaryKey(id);
        return response;
    }

    @Override
    public List<Ad> queryAdAll() {
        AdExample example = new AdExample();
        return adMapper.selectByExample(example);
    }


}
