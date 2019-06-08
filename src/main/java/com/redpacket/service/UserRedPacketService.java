package com.redpacket.service;

/**
 * @author Milingyun
 * @date 2019-05-26 15:54
 */
public interface UserRedPacketService {
    public int grapRedPacket(Long redPacketId, Long userId);

    public int grapRedPacket2(Long redPacketId, Long userId);

    public int grapRedPacket3(Long redPacketId, Long userId);

    public Long grapRedPacketByRedis(Long redPacketId, Long userId);
}
