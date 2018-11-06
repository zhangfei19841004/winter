package com.zf.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
public class WebController {

    @Value("${workspace.dir}")
    private String workspaceDir;

    @RequestMapping(value = "/index")
    public String index(Map<String, Object> map, HttpServletRequest request) throws Exception {
        return "welcome";
    }

}
