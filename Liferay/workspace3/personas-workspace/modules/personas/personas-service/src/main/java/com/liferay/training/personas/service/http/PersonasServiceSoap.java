/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.personas.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.training.personas.service.PersonasServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>PersonasServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.training.personas.model.PersonasSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.training.personas.model.Personas</code>, that is translated to a
 * <code>com.liferay.training.personas.model.PersonasSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonasServiceHttp
 * @generated
 */
public class PersonasServiceSoap {

	public static com.liferay.training.personas.model.PersonasSoap addPersonas(
			String dni, String nombre, String apellido1, String apellido2,
			java.util.Date nacimiento, String sexo, double altura,
			boolean trabaja)
		throws RemoteException {

		try {
			com.liferay.training.personas.model.Personas returnValue =
				PersonasServiceUtil.addPersonas(
					dni, nombre, apellido1, apellido2, nacimiento, sexo, altura,
					trabaja);

			return com.liferay.training.personas.model.PersonasSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static int countByNacimiento(java.util.Date nacimiento)
		throws RemoteException {

		try {
			int returnValue = PersonasServiceUtil.countByNacimiento(nacimiento);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static int countBySexo(String sexo) throws RemoteException {
		try {
			int returnValue = PersonasServiceUtil.countBySexo(sexo);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static int countByTrabaja(boolean trabaja) throws RemoteException {
		try {
			int returnValue = PersonasServiceUtil.countByTrabaja(trabaja);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.personas.model.PersonasSoap
			deletePersonas(String dni)
		throws RemoteException {

		try {
			com.liferay.training.personas.model.Personas returnValue =
				PersonasServiceUtil.deletePersonas(dni);

			return com.liferay.training.personas.model.PersonasSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.personas.model.PersonasSoap[]
			findByNacimiento(java.util.Date nacimiento)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.personas.model.Personas>
				returnValue = PersonasServiceUtil.findByNacimiento(nacimiento);

			return com.liferay.training.personas.model.PersonasSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.personas.model.PersonasSoap[]
			findByNacimiento(java.util.Date nacimiento, int start, int end)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.personas.model.Personas>
				returnValue = PersonasServiceUtil.findByNacimiento(
					nacimiento, start, end);

			return com.liferay.training.personas.model.PersonasSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.personas.model.PersonasSoap[] findBySexo(
			String sexo)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.personas.model.Personas>
				returnValue = PersonasServiceUtil.findBySexo(sexo);

			return com.liferay.training.personas.model.PersonasSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.personas.model.PersonasSoap[] findBySexo(
			String sexo, int start, int end)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.personas.model.Personas>
				returnValue = PersonasServiceUtil.findBySexo(sexo, start, end);

			return com.liferay.training.personas.model.PersonasSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.personas.model.PersonasSoap[]
			findByTrabaja(boolean trabaja)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.personas.model.Personas>
				returnValue = PersonasServiceUtil.findByTrabaja(trabaja);

			return com.liferay.training.personas.model.PersonasSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.personas.model.PersonasSoap[]
			findByTrabaja(boolean trabaja, int start, int end)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.personas.model.Personas>
				returnValue = PersonasServiceUtil.findByTrabaja(
					trabaja, start, end);

			return com.liferay.training.personas.model.PersonasSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.personas.model.PersonasSoap
			updatePersonas(
				String dni, String nombre, String apellido1, String apellido2,
				java.util.Date nacimiento, String sexo, double altura,
				boolean trabaja)
		throws RemoteException {

		try {
			com.liferay.training.personas.model.Personas returnValue =
				PersonasServiceUtil.updatePersonas(
					dni, nombre, apellido1, apellido2, nacimiento, sexo, altura,
					trabaja);

			return com.liferay.training.personas.model.PersonasSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PersonasServiceSoap.class);

}