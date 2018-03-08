package com.molt.cc.learningapi.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.molt.cc.gen.model.Ad;
import com.molt.cc.gen.model.Member;
import com.molt.cc.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/ad")
public class AdController {

    @Autowired
    private AdService adService;

    @RequestMapping("/dataList")
    public List<Ad> dataList(){
       return adService.dataList();
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Integer insert(@RequestBody Ad ad){
        return adService.insert(ad);
    }

    @RequestMapping(value = "/deleted/{id}",method = RequestMethod.GET)
    public Integer deletedById(@PathVariable Integer id){
        return adService.deletedById(id);
    }

    @RequestMapping(value="/queryAdAll",method = RequestMethod.GET)
    public PageInfo<Ad> queryAdAll(){
        PageInfo  pageInfo = new PageInfo(adService.queryAdAll());
        return pageInfo;
    }

    @RequestMapping("/adPage")
    public Object dataList2(int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Ad> list = adService.dataList();
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("放入一个Map","测试....");
        map.put("record",list);
        List<Object> list1 = new ArrayList<Object>();
        list1.add(map);
        PageInfo pageInfo = new PageInfo(list1);
        return  map;
    }


    @RequestMapping("/Java8")
    public Object java8(){
        MyLambdaInterface aBlockOfCode = (s) -> System.out.println(s);
        aBlockOfCode.doSomeShit("我是来测试JAVA8的~~~~~");
        aBlockOfCode.doSomeShit("我就想看看这次你会输出什么出来~~~~");
        MyLambdaInterface aBlockjOfCode2 = (s -> System.out.println(s));
        aBlockjOfCode2.doSomeShit("Test 2 ->aBlockjOfCode2 ");
        return "~~~~";
    }





}
