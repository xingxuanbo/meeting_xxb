<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
    <head>
        <title>CoolMeeting会议管理系统</title>
        <link rel="stylesheet" href="../styles/common.css"/>
    </head>
    <body>
        
        <div class="page-body">
            
            <div class="page-content">
                <div class="content-nav">
                    会议预定 > 查看会议室
                </div>
                <table class="listtable">
                    <caption>所有会议室:</caption>
                    <tr class="listheader">
                        <th>门牌编号</th>
                        <th>会议室名称</th>
                        <th>容纳人数</th>
                        <th>当前状态</th>
                        <th>操作</th>
                    </tr>
                    
                    <c:forEach var="r" items="${requestScope.room }">
	                    <tr>
	                        <td>${r.roomnum }</td>
	                        <td>${r.roomname }</td>
	                        <td>${r.capacity }</td>
	                        <c:if test="${r.status.equals('0') }" >
		                        <td>可用</td>
		                    </c:if>    
		                    <c:if test="${r.status.equals('1') }" >    
		                        <td>不可用</td>
	                        </c:if>
	                        <td>
		                        <a class="clickbutton" href="roomdetailsServlet?roomid=${r.roomid }">查看详情</a>
		                    </td>
	                    </tr>
                    </c:forEach>
                    
                    
                </table>
            </div>
        </div>
       
    </body>
</html>
