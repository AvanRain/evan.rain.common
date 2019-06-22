package com.wanyus.evan.web.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Rain
 * @program : evan.rain.common
 * @description : 首页导购API
 * @create : 2019-06-22 16:12:42
 * @date : 2019-06-22 16:12:42
 **/
@Controller
@RequestMapping(value = "/api")
public class IndexApiController {

    @RequestMapping(value = "/index",method = {RequestMethod.POST},produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        Map<String,Object> result = new HashMap<String,Object>(2);
        result.put("pictureUrl","/imgs/image/ab0.jpg");
        result.put("comment","彩虹1");
//        result.put("","");
        return JSON.toJSONString(result);
    }

}
