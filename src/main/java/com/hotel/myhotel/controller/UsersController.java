package com.hotel.myhotel.controller;

import com.hotel.myhotel.pojo.Users;
import com.hotel.myhotel.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/users")
@Api("用户接口")
public class UsersController {
    @Autowired
    UsersService usersService;
    @ApiOperation("查询所有用户")
    @GetMapping("/getAll")
    public List<Users> getAll(){
        return usersService.list();
    }
}
