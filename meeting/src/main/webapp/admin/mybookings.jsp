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
        <style type="text/css">
            
        </style>
    </head>
    <body>
        <div class="page-body">
            
            <div class="page-content">
                <div class="content-nav">
                    个人中心 > 我的预定
                </div>
                <table class="listtable">
                    <caption>我预定的会议：</caption>
                    <tr class="listheader">
                        <th>会议名称</th>
                        <th>会议室名称</th>
                        <th>会议开始时间</th>
                        <th>会议结束时间</th>
                        <th>会议预定时间</th>
                        <th>操作</th>
                    </tr>
                    
                    <c:forEach var="item" items="${requestScope.map }">
                    	<tr>
	                        <td>${item.key.meetingname }</td>
	                        <td>${item.value }</td>
	                        <td>${item.key.starttime }</td>
	                        <td>${item.key.endtime }</td>
	                        <td>${item.key.reservationtime }</td>
	                        <c:if test="${item.key.status.equals('0') }">
	                        	<td>
                            		<a class="clickbutton" href="mymeetingdetailsServlet?meetingid=${item.key.meetingid}">查看/撤销</a>
	                        	</td>
	                        </c:if>
	                        
	                        <c:if test="${item.key.status.equals('1') }">
	                        	<td>
                            		<a class="clickbutton" href="mymeetingdetailsServlet?meetingid=${item.key.meetingid}">查看/已撤销</a>
	                        	</td>
	                        </c:if>
	                        
	                    </tr>	
                    </c:forEach>
                   
                    
                </table>
            </div>
        </div>
        
    </body>
</html>
