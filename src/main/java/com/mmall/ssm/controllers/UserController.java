package com.mmall.ssm.controllers;


import com.mmall.ssm.entity.UserInfo;
import com.mmall.ssm.pojo.UserInfoPoJo;
import com.mmall.ssm.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/12/25.
 */
@Controller
@RequestMapping("/users/")
public class UserController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "userInfo", produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object getUserInfo() {
        List<UserInfo> userInfo = userInfoService.getUserInfo();
        return userInfo;
    }

 /*   @RequestMapping(value = "addUserInfo", produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object addUserInfo(@RequestParam("uName") String uName) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(uName);
        userInfo.setAddress("来广营");
        userInfo.setEmail("437436270@qq.com");
        userInfo.setMobile("18336009873");
        userInfoService.addUserInfo(userInfo);
        return userInfo;
    }


    *//**
     * spring-mvc 数据校验
     *
     * @param userInfo
     * @param bindingResult
     * @return
     *//*
    @RequestMapping(value = "addUserInfoValidated", produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object addUserInfo(@Validated UserInfo userInfo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return bindingResult.getFieldError().getDefaultMessage();
        }
        userInfoService.addUserInfo(userInfo);
        return userInfo;
    }


    *//**
     * 数据校验
     *
     * @param userInfo
     * @param bindingResult
     * @return
     *//*
    @RequestMapping(value = "hibernateValidated", produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object addUserInfoForHibernate(@Valid UserInfo userInfo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return bindingResult.getFieldError().getDefaultMessage();
        }
        userInfoService.addUserInfo(userInfo);
        return userInfo;
    }


    @RequestMapping(value = "delUserInfo", produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object delUserInfo(@RequestParam("uName") String uName) {
        boolean b = userInfoService.delUserInfoByName(uName);
        return b;
    }

    @RequestMapping(value = "updateUserInfo", produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object UpdateUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("seen");
        userInfo.setAddress("来广营");
        userInfo.setEmail("437436270@qq.com");
        userInfo.setMobile("18336009873");
        return userInfo;
    }*/


   /* @RequestMapping(value = "requestUserInfo", produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object requestUserInfo(HttpServletRequest request, HttpSession session) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("seen");
        userInfo.setAddress("来广营");
        userInfo.setEmail("437436270@qq.com");
        userInfo.setMobile("18336009873");
        session.setAttribute("name", userInfo.getUserName());
        return userInfo;
    }


    @RequestMapping(value = "sessionUserInfo", produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object sessionUserInfo(HttpSession session, HttpServletRequest request) {
        String name = (String) session.getAttribute("name");
        System.out.println(name);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("seen");
        userInfo.setAddress("来广营");
        userInfo.setEmail("437436270@qq.com");
        userInfo.setMobile("18336009873");
        return userInfo;
    }*/


}
