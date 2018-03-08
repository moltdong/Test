package com.molt.cc.service;

import com.molt.cc.gen.model.Ad;

import java.util.List;

public interface AdService {

    List<Ad> dataList();

    Integer insert(Ad ad);

    Integer deletedById(Integer id);

    List<Ad> queryAdAll();
}
