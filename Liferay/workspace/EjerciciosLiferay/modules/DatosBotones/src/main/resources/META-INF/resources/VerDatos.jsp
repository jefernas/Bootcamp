<%@ include file="/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:renderURL var="volverURL">
	<portlet:param name="mvcPath" value="/view.jsp"/> 
</portlet:renderURL>



<div class="table-responsive">
    <table class="table table-bordered">
        <tr>
        	<td>DNI</td>
        	<td>Nombre</td>
        	<td>Primer Apellido</td>
        	<td>Segundo Apellido</td>
        	<td>Fecha Nacimiento</td>
        	<td>Sexo</td>
        </tr>
        <tr>
        	<td>1234567A</td>
        	<td>Paco</td>
        	<td>Rodriguez</td>
        	<td>Diaz</td>
        	<td>10/10/1992</td>
        	<td>Hombre</td>
        </tr>
        <tr>
        	<td>2345678B</td>
        	<td>Maria</td>
        	<td>Fernandez</td>
        	<td>Garcia</td>
        	<td>1/5/2003</td>
        	<td>Mujer</td>
        </tr>
        <tr>
        	<td>3456789C</td>
        	<td>Luis</td>
        	<td>Garruta</td>
        	<td>Lopez</td>
        	<td>31/12/1999</td>
        	<td>Hombre</td>
        </tr>
        <tr>
        	<td>4567891E</td>
        	<td>Lucia</td>
        	<td>Perez</td>
        	<td>Camino</td>
        	<td>1/1/2000</td>
        	<td>Mujer</td>
        </tr>
    </table>
</div>


<button onclick="location.href='<%= volverURL %>'" class="btn btn-primary" type="button">Volver</button>