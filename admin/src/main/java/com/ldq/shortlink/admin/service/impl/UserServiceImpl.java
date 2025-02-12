package com.ldq.shortlink.admin.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ldq.shortlink.admin.dao.entity.UserDO;
import com.ldq.shortlink.admin.dao.mapper.UserMapper;
import com.ldq.shortlink.admin.dto.resp.UserDTO;
import com.ldq.shortlink.admin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    public UserDTO getByUserName(String username) {
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO::getUsername, username);
        UserDO one = baseMapper.selectOne(queryWrapper);
        UserDTO ret = new UserDTO();
        BeanUtils.copyProperties(one, ret);
        return ret;
    }
}
