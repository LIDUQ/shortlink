package com.ldq.shortlink.admin.controller;

import com.ldq.shortlink.admin.convention.result.Result;
import com.ldq.shortlink.admin.convention.result.Results;
import com.ldq.shortlink.admin.dto.resp.UserDTO;
import com.ldq.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
    用户管理
 */

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/api/short-link/admin/v1/user/{username}")
    public Result<UserDTO> getUser(@PathVariable String username){
        UserDTO userDTO =  userService.getByUserName(username);
        return Results.success(userDTO);
    }
}
