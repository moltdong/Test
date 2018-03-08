package com.molt.cc.service.impl;

import com.github.pagehelper.PageHelper;
import com.molt.cc.gen.mapper.MemberMapper;
import com.molt.cc.gen.model.Member;
import com.molt.cc.gen.model.MemberExample;
import com.molt.cc.gen.utlis.PageBean;
import com.molt.cc.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper ;

    @Override
    public List<com.molt.cc.gen.model.Member> dataList() {
        MemberExample example = new MemberExample();
        return memberMapper.selectByExample(example);
    }

    @Override
    public List<com.molt.cc.gen.model.Member> findItemByPage(int currentPage, int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);
        MemberExample example = new MemberExample();
        List<Member> memberList = memberMapper.selectByExample(example);        //全部商品
        int countNums = memberList.size();//总记录数
        PageBean<Member> pageData = new PageBean<Member>(currentPage, pageSize, countNums);
        pageData.setItems(memberList);
        System.out.println(pageData.getItems().size());
        return pageData.getItems();

     }
}
