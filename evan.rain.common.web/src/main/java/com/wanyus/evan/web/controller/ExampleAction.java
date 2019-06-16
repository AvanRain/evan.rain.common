package com.wanyus.evan.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @Description: 
 * @author  Raub
 * @date 2014-11-18 下午09:05:43
 * @version V1.0  
 *
 */ 
@Controller
@RequestMapping( "/demo" )
public class ExampleAction {

	private final static Logger logger = LoggerFactory.getLogger(ExampleAction.class);

	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
//    @RequestMapping(value = "/card/api/index",method = {RequestMethod.GET, RequestMethod.POST} ,produces = {"application/json;charset=UTF-8"})
//    @ResponseBody
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){

	    return "/index";
    }
}
