package com.mmall.ssm.services;

import com.mmall.ssm.entity.UserInfo;
import com.mmall.ssm.pojo.UserInfoPoJo;
import com.mmall.ssm.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/12/26.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {


/*    @Autowired
    UserInfoRepository userInfoRepository;*/


    @Override
    public List<UserInfo> getUserInfo() {
//        List<UserInfo> all = userInfoRepository.findAll();

        return null;
    }


}
