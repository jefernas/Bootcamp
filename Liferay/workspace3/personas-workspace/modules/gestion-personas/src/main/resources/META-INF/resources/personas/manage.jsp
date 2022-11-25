<%@ include file="/view.jsp"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<portlet:defineObjects />
<portlet:actionURL name="updatePersonas" var="updatePersonasActionURL"/>

<liferay-portlet:renderURL var= "viewURL">
	<liferay-portlet:param name="mvcRenderCommandName" value="view"/>
</liferay-portlet:renderURL>


<form action="view.jsp" method="POST">
<aui:form action="<%=manageURL %>" name="personasForm" method="POST">
    <aui:input name="dni" >
         <aui:validator name="required"/>
         <aui:validator name="alphanum"/>
    </aui:input>
 
    <aui:input name="nombre" >
         
         <aui:validator name="alpha"/>
    </aui:input>
 
    <aui:input name="apellido1" >
         
         <aui:validator name="alpha"/>
    </aui:input> 
 
    <aui:input name="apellido2" >
         
         <aui:validator name="alpha"/>
    </aui:input>
 
    <aui:input name="sexo">
         
         <aui:validator name="alpha"/>
    </aui:input>  
    
    <aui:input name="altura">
         
         <aui:validator name="number"/>
    </aui:input>  
    
    <aui:input name="trabaja">
         
         <aui:validator name="alpha"/>
    </aui:input>  
    
    <aui:input name="nacimiento">
         
         <aui:validator name="date"/>
    </aui:input>  
 
 	<aui:input type="submit" value="Update" name="update"></aui:input>
    <%-- <aui:button type="submit" name="" value="Submit"></aui:button> --%>
</aui:form>


<aui:a href="<%= viewURL %>"><button>Inicio Personas</button></aui:a>