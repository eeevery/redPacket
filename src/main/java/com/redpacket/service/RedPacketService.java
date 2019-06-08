package com.redpacket.service;


import com.redpacket.pojo.RedPacket;

/**
 * @author Milingyun
 * @date 2019-05-26 15:52
 */
public interface RedPacketService {
    public RedPacket getRedPacket(Long id);
    public int decreaseRedPacket(Long id);
}
