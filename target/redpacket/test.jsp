<%--
  Created by IntelliJ IDEA.
  User: XJTU
  Date: 2019/5/27
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            //模拟20000个异步请求，进行并发
            var max=10;
            for(var i=1;i<=max;i++){
                //jQuery的post请求，这是异步请求
                $.post({
                    //请求抢id为1的红包
                    url: "./userRedPacket/grapRedPacketByRedis?redPacketId=1&userId="+i,
                    //成功后的方法
                    success:function(result){}
                });
            }
        });
    </script>
</head>
<body>
hei
</body>
</html>
