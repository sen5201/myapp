package com.denali.app.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.denali.app.entity.SysRole;
import com.denali.app.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sen
 * @since 2019-11-20
 */
@Controller
@RequestMapping("/test")
public class SysRoleController {


    @Autowired
    private SysRoleMapper sysRoleMapper;

    @RequestMapping ("/sendMsg")
    public void sendMsg(){

        IPage<SysRole> sysRoleIPage = sysRoleMapper.selectPage(new Page<SysRole>(0, 1), null);

        System.out.println(sysRoleIPage.getRecords());

    }



}
