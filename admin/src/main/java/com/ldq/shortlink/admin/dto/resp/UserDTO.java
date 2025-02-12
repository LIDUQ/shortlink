package com.ldq.shortlink.admin.dto.resp;

import lombok.Data;

@Data
public class UserDTO {

    private Long id;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 用户真实姓名
     */
    private String realName;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String mail;
}
