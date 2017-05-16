<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<!--如果为escapeXml="false"，则将其中的html和xml解析出来。-->
<json:object escapeXml="false">
		  <json:object name="student"><!--object下对应的是每一个对象，property是属性 -->
			<json:property name="name" value="${student.name}" />
			<json:property name="qq" value="${student.qq}" />
			<json:property name="id" value="${student.id}" />
		</json:object> 
</json:object> 