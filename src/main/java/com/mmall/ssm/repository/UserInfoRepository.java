package com.mmall.ssm.repository;

import com.mmall.ssm.entity.UserInfo;
import com.mmall.ssm.pojo.UserInfoPoJo;

import java.util.List;

/**
 * Created by Administrator on 2019/12/26.
 */
public interface UserInfoRepository {
    List<UserInfo> findAll();

}
