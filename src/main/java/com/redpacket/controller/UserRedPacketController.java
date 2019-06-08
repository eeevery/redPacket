package com.redpacket.controller;

import com.redpacket.service.UserRedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Milingyun
 * @date 2019-05-27 21:26
 */
@Controller
@RequestMapping("/userRedPacket")
public class UserRedPacketController {
    @Autowired
    private UserRedPacketService userRedPacketService=null;

    @RequestMapping("/grapRedPacket")
    @ResponseBody//使用该注解，会将返回结果转变为一个JSON返回给前端请求
    public Map<String,Object> grapRedPacket(Long redPacketId, Long userId){
        int result = userRedPacketService.grapRedPacket(redPacketId,userId);
        Map<String,Object>  resultMap=new HashMap<String,Object>();
        boolean flag=result>0;
        resultMap.put("success",flag);
        resultMap.put("message",flag?"抢红包成功":"抢红包失败");
        return resultMap;
    }

    @RequestMapping(value="/grapRedPacketByRedis")
    @ResponseBody
    public Map<String, Object> grapRedPacketByRedis(Long redPacketId, Long userId){
        Map<String,Object> resultMap=new HashMap<String,Object>();
        Long result =userRedPacketService.grapRedPacketByRedis(redPacketId,userId);
        boolean flag=result>0;
        resultMap.put("message",flag?"抢红包成功":"抢红包失败");
        return resultMap;
}
}
