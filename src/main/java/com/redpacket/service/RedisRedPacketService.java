package com.redpacket.service;

/**
 * @author Milingyun
 * @date 2019-05-30 11:12
 */
public interface RedisRedPacketService {
    /**
     * 保存redis抢红包信息
     * @param redPacketId
     * @param unitAmount
     */
    public void saveUserRedPacketByRedis(Long redPacketId, Double unitAmount);
}
