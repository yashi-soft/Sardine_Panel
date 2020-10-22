package com.example.mysecurity.entity.req;

import com.example.mysecurity.entity.SardlineRole;
import lombok.Data;

@Data
public class SardlineRoleReq extends SardlineRole {

    //菜单信息

    //按钮信息

    /**
     * 菜单信息
     */
    private String menus;

    /**
     * api信息
     */
    private String apis;

    private String orgId;


}
