package com.sb.sbdemo.controller;

import com.sb.sbdemo.access.LoginAccess;
import com.sb.sbdemo.model.FfaDemand;
import com.sb.sbdemo.page.PageInfo;
import com.sb.sbdemo.service.FfaDemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by yeli on 1/8/18.
 */
@Controller
public class IndexController {

    @Autowired
    private FfaDemandService ffaDemandService;

    @RequestMapping(value = "/")
    public String index(ModelMap modelMap, PageInfo pageInfo) {

        List<FfaDemand> ffaDemandList = this.ffaDemandService.queryList(pageInfo);
        modelMap.put("demandList", ffaDemandList);
        return "index";
    }

    @RequestMapping(value = "/login_access")
    @LoginAccess
    public String loginAccess(){
        return "login_access";
    }
}
