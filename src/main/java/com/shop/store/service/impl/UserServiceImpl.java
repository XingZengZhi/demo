package com.shop.store.service.impl;

import com.shop.store.entity.Role;
import com.shop.store.entity.User;
import com.shop.store.repository.UserRepository;
import com.shop.store.repository.page.PageUserRepository;
import com.shop.store.service.RoleService;
import com.shop.store.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月21日)
 */

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    @Resource
    private UserRepository userRepository;

    @Resource
    private RoleService roleService;

    @Resource
    private PageUserRepository pageUserRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Page<User> findAllUserByPage(Integer pageStart, Integer pageEnd) {
        return pageUserRepository.findAll(PageRequest.of(pageStart,pageEnd));
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAllUser();
    }

    @Override
    public List<User> findUserByUserName(String username) {
        return userRepository.findAllByUsername(username);
    }

    @Override
    public User findByUserId(Integer userid) {
        return userRepository.findByUserId(userid);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findUserByUserName(username).get(0);

        System.out.println("查找用户：" + username);

        if(user == null) {
            throw new UsernameNotFoundException("没有该用户");
        }

        // GrantedAuthority是security提供的权限类
        List<GrantedAuthority> list = new ArrayList<>(); //GrantedAuthority是security提供的权限类，

        // 获取角色，放到list
        getRoles(user, list);

        org.springframework.security.core.userdetails.User auth_user =
                new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), list);

        //查到User后将其封装为UserDetails的实现类的实例供程序调用
        //用该User和它对应的Role实体们构造UserDetails的实现类
        return auth_user;
    }

    private void getRoles(User user,List<GrantedAuthority> list){
        for (Role role : roleService.getRolesOfUser(user.getUsername())) {
            //权限如果前缀是ROLE_，security就会认为这是个角色信息，而不是权限，例如ROLE_MENBER就是MENBER角色，CAN_SEND就是CAN_SEND权限
            // list.add(new SimpleGrantedAuthority("ROLE_" + role));
            list.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
    }
}
