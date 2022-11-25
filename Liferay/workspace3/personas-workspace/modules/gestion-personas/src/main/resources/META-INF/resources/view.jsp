<%@ include file="/init.jsp"%>

<p>
	<b><liferay-ui:message key="personas.caption" /></b>
</p>

<liferay-portlet:renderURL var= "manageURL">
	<liferay-portlet:param name="mvcRenderCommandName" value="manage"/>
</liferay-portlet:renderURL>





<div class="container-fluid-1280">
	<h1>
		<liferay-ui:message key="Personas" />
	</h1>
	
	<%-- Clay management toolbar. --%>
	<%-- <clay:management-toolbar disabled="${personasCount eq 0}"--%>
	<clay:management-toolbar disabled= "false" 
		displayContext="${personasManagementToolbarDisplayContext}"
		itemsTotal="${personasCount}" 
		searchContainerId="personasEntries"
		selectable="true" 
		
	
   
		/>
		
		
	<%-- Search container. --%>
	<liferay-ui:search-container emptyResultsMessage="No hay personas que mostrar"
		id="personasEntries" iteratorURL="${portletURL}"
		total="${personasCount}">
		<liferay-ui:search-container-results results="${personas}" />
		
		<liferay-ui:search-container-row
			className="com.liferay.training.personas.model.Personas"
			modelVar="entry">
			<%@ include file="/personas/entry_search_columns.jspf"%>
		</liferay-ui:search-container-row>

		<%-- Iterator / Paging --%>
		<liferay-ui:search-iterator
			displayStyle="${personasManagementToolbarDisplayContext.getDisplayStyle()}"
			markupView="lexicon" />
			
	</liferay-ui:search-container>
	

	<aui:a href="<%= manageURL %>"><button>Manage</button><br><br></aui:a>
</div>
