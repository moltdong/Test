package com.molt.cc.learningapi.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.molt.cc.gen.model.Member;
import com.molt.cc.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/member")
public class MemberController {


    @Autowired
    private MemberService memberService;

    @RequestMapping("/dataList")
    private List<Member> dataList(){
        return memberService.dataList();
    }

    @RequestMapping("/MemberPage")
    public List<Member> itemsPage(int currentPage,int pageSize){
        return memberService.findItemByPage(currentPage, pageSize);
    }

    @RequestMapping("/MemberPage2")
    public Object dataList2(int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Member> list = memberService.dataList();
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("放入一个Map","测试....");
        map.put("record",list);
        List<Object> list1 = new ArrayList<Object>();
        list1.add(map);
        PageInfo  pageInfo = new PageInfo(list1);
        return  map;
    }


}
