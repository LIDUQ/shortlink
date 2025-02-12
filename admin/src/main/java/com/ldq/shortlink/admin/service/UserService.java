package com.ldq.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ldq.shortlink.admin.dao.entity.UserDO;
import com.ldq.shortlink.admin.dto.resp.UserDTO;


public interface UserService extends IService<UserDO> {
    UserDTO getByUserName(String username);
}
