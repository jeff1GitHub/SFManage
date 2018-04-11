package com.sf.manage.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.sf.manage.entry.Member;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author jeff
 * @since 2018-04-11
 */
public interface IMemberService extends IService<Member> {
    /**
     * 获取会员列表
     *
     * @return
     */
    Page<Member> getMemberList(Integer pageNo, Integer pageSize);

    /**
     * 根据id获取会员
     *
     * @param id 会员id
     * @return
     */
    Member getMemberById(Integer id);

    /**
     * 根据帐号获取会员
     *
     * @param account 会员帐号
     * @return
     */
    Member getMenberByAccount(String account);

    /**
     * 修改会员
     *
     * @param member 会员对象
     * @return
     */
    boolean updateMember(Member member);

    /**
     * 新增会员
     *
     * @param member 会员对象
     * @return
     */
    boolean saveMember(Member member);
}
