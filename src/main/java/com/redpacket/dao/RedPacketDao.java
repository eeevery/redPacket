package com.redpacket.dao;

import com.redpacket.pojo.RedPacket;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * @author Milingyun
 * @date 2019-05-26 11:46
 */

@Repository
public interface RedPacketDao {

    public RedPacket getRedPacket(Long id);

    public int decreaseRedPacket(Long id);

    RedPacket getRedPacketForUpdate(Long redPacketId);

    public int decreaseRedPacketForVersion(@Param("id") long redPacketId, @Param("version")Integer version);
}
