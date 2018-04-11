package com.sf.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    /**
     * 网站首页
     *
     * @param model
     * @return
     */
    @RequestMapping("/")
    public ModelAndView index(ModelAndView model) {
        model.setViewName("index");
        return model;
    }

    /**
     * 会员列表页面
     *
     * @param model
     * @return
     */
    @RequestMapping("member-list")
    public ModelAndView getMemberListPage(ModelAndView model) {
        model.setViewName("member-list");
        return model;
    }
}
