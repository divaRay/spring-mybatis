<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!--如果为escapeXml="false"，则将其中的html和xml解析出来。-->
<json:object escapeXml="false">
<!--列表的名字是studentlist，items后面跟的是要遍历的表，var后面跟的是要遍历的元素 -->
	<json:array name="studentlist">
		<c:forEach items="${studentlist}" var="student"> 
		  <json:object><!--object下对应的是每一个对象，property是属性 -->
			<json:property name="name" value="${student.name}" />
			<json:property name="qq" value="${student.qq}" />
			<json:property name="id" value="${student.id}" />
		</json:object> </c:forEach>
	</json:array>
</json:object> 