package com.redpacket.service.impl;

import com.redpacket.dao.RedPacketDao;
import com.redpacket.pojo.RedPacket;
import com.redpacket.service.RedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Milingyun
 * @date 2019-05-26 15:55
 */

@Service
public class RedPacketServiceImpl implements RedPacketService {
   @Autowired
    private RedPacketDao redPacketDao=null;
    @Override
    public RedPacket getRedPacket(Long id) {
        return null;
    }

    @Override
    public int decreaseRedPacket(Long id) {
        return 0;
    }
}
