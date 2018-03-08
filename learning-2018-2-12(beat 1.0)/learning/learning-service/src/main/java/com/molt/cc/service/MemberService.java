package com.molt.cc.service;

import com.molt.cc.gen.model.Member;

import java.util.List;

public interface MemberService {

    List<Member> dataList();

    List<Member> findItemByPage(int currentPage, int pageSize);
}
