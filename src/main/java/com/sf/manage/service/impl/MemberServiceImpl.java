package com.sf.manage.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sf.manage.entry.Member;
import com.sf.manage.mapper.MemberMapper;
import com.sf.manage.service.IMemberService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jeff
 * @since 2018-04-11
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

    @Override
    public Page<Member> getMemberList(Integer pageNo, Integer pageSize) {
        Page<Member> page = new Page<>(pageNo, pageSize);
        return super.selectPage(page);
    }

    @Override
    public Member getMemberById(Integer id) {
        return super.selectById(id);
    }

    @Override
    public Member getMenberByAccount(String account) {
        EntityWrapper<Member> wrapper = new EntityWrapper<>();
        wrapper.eq("account", account);
        return super.selectOne(wrapper);
    }

    @Override
    public boolean updateMember(Member member) {
        return super.updateById(member);
    }

    @Override
    public boolean saveMember(Member member) {
        return super.insert(member);
    }
}
