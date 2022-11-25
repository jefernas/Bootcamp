<%@ include file="../init.jsp"%>
<%@ page import="com.liferay.training.gestion.personas.constants.*"%>
<c:set var="personas" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />
<liferay-ui:icon-menu markupView="lexicon">

	<%-- View action. --%>
	<portlet:renderURL var="viewPersonasURL">
		<portlet:param name="mvcRenderCommandName"
			value="<%=MVCCommandNames.VIEW_PERSONAS%>" />
		<portlet:param name="redirect" value="${currentURL}" />
		<portlet:param name="dni" value="${personas.dni}" />
	</portlet:renderURL>
	<liferay-ui:icon message="view" url="${viewPersonasURL}" />
	
	<%-- Edit action. --%>
	<portlet:renderURL var="editPersonasURL">
		<portlet:param name="mvcRenderCommandName"
			value="<%=MVCCommandNames.EDIT_PERSONAS%>" />
		<portlet:param name="redirect" value="${currentURL}" />
		<portlet:param name="dni" value="${personas.dni}" />
	</portlet:renderURL>
	<liferay-ui:icon message="edit" url="${editPersonasURL}" />
	
	<%-- Delete action. --%>
	<portlet:actionURL name="<%=MVCCommandNames.DELETE_PERSONAS%>"
		var="deletePersonasURL">
		<portlet:param name="redirect" value="${currentURL}" />
		<portlet:param name="dni" value="${personas.dni}" />
	</portlet:actionURL>
	<liferay-ui:icon-delete url="${deletePersonasURL}" />
</liferay-ui:icon-menu>