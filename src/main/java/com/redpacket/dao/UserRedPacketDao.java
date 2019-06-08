package com.redpacket.dao;
import com.redpacket.pojo.RedPacket;
import com.redpacket.pojo.UserRedPacket;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Milingyun
 * @date 2019-05-26 15:43
 */
@Repository
public interface UserRedPacketDao {
    public int grapRedPacket(UserRedPacket userRedPacket);
}
