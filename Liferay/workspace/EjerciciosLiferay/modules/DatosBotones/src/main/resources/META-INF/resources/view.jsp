<%@ include file="/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>




<portlet:renderURL var="verDatosURL">
	<portlet:param name="mvcPath" value="/VerDatos.jsp"/> 
</portlet:renderURL>

<portlet:renderURL var="editarDatosURL">
	<portlet:param name="mvcPath" value="/EditarDatos.jsp"/> 
</portlet:renderURL>

<button onclick="location.href='<%= verDatosURL %>'" class="btn btn-primary" type="button">Ver Datos</button>
<button onclick="location.href='<%= editarDatosURL %>'" class="btn btn-primary" type="button" >Editar Datos</button>
