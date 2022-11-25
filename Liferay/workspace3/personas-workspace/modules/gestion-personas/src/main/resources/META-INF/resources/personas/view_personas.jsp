<%@ include file="/init.jsp"%>
<div class="container-fluid-1280">
	<h1>${personas.nombre}</h1>
	<h2>
		<liferay-ui:message key="personas-information" />
	</h2>
	<div class="personas-metadata">
		<dl>
			<dt>
				<liferay-ui:message key="dni" />
			</dt>
			<dd>${personas.dni}</dd>
			<dt>
				<liferay-ui:message key="nombre" />
			</dt>
			<dd>${personas.nombre}</dd>
			<dt>
				<liferay-ui:message key="apellido1" />
			</dt>
			<dd>${personas.apellido1}</dd>
			<dt>
				<liferay-ui:message key="apellido2" />
			</dt>
			<dd>${personas.apellido2}</dd>
			<dt>
				<liferay-ui:message key="sexo" />
			</dt>
			<dd>${personas.sexo}</dd>
			<dt>
				<liferay-ui:message key="altura" />
			</dt>
			<dd>${personas.altura}</dd>
			<dt>
				<liferay-ui:message key="nacimiento" />
			</dt>
			<dd>${personas.nacimiento}</dd>
			<dt>
				<liferay-ui:message key="trabaja" />
			</dt>
			<dd>${personas.trabaja}</dd>
		</dl>
	</div>
</div>