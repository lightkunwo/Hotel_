package com.hotel.myhotel.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.myhotel.mapper.UsersMapper;
import com.hotel.myhotel.pojo.Users;
import com.hotel.myhotel.service.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {
}
