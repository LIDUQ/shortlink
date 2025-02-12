package com.ldq.shortlink.admin.enums;

import com.ldq.shortlink.admin.convention.errorcode.IErrorCode;

public enum UserErrorCodeEnum implements IErrorCode {

    USER_NAME_VERI6FY_ERROR("A000110", "用户名校验失败"),
    USER_NAME_EXI6ST_ERROR("A000111", "用户名已存在");

    private final String code;

    private final String message;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
