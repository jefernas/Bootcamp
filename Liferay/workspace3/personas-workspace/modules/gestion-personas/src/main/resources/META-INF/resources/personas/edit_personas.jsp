<%@ include file="../init.jsp"%>
<%-- Generate add / edit action URL and set title. --%>
<c:choose>
<c:when test="${not empty personas}">
<portlet:actionURL var="personasActionURL" name="<%=MVCCommandNames.EDIT_PERSONAS <portlet:param name="redirect" value="${param.redirect}" />
</portlet:actionURL>
<c:set var="editTitle" value="edit-personas"/>
</c:when>
<c:otherwise>
<portlet:actionURL var="personasActionURL" name="<%=MVCCommandNames.ADD_PERSONAS <portlet:param name="redirect" value="${param.redirect}" />
</portlet:actionURL>
<c:set var="editTitle" value="add-personas"/>
</c:otherwise>
</c:choose>
<div class="container-fluid-1280 edit-personas">
<h1><liferay-ui:message key="${editNombre}" /></h1>
<aui:model-context bean="${personas}" model="${personasClass}" />
<aui:form action="${personasActionURL}" name="fm">
<aui:input name="dni" field="dni" type="hidden" />
<aui:fieldset-group markupView="lexicon">
<aui:fieldset>
<%-- Title field. --%>
<aui:input name="nombre">
</aui:input>
<%-- Description field. --%>
<aui:input name="apellido1">
<aui:validator name="required" />
</aui:input>
<%-- Due date field. --%>
<aui:input name="apellido2">
<aui:validator name="required" />
</aui:input>
</aui:fieldset>
</aui:fieldset-group>
<%--Buttons. --%>
<aui:button-row>
<aui:button cssClass="btn btn-primary" type="submit" />
<aui:button cssClass="btn btn-secondary" onClick="${param.redirect}" type="</aui:button-row>
</aui:form>
</div>