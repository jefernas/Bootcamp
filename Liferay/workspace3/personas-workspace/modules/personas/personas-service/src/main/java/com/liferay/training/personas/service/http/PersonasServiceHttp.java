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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.training.personas.service.PersonasServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>PersonasServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonasServiceSoap
 * @generated
 */
public class PersonasServiceHttp {

	public static com.liferay.training.personas.model.Personas addPersonas(
			HttpPrincipal httpPrincipal, String dni, String nombre,
			String apellido1, String apellido2, java.util.Date nacimiento,
			String sexo, double altura, boolean trabaja)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "addPersonas",
				_addPersonasParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, dni, nombre, apellido1, apellido2, nacimiento, sexo,
				altura, trabaja);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.personas.model.Personas)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int countByNacimiento(
		HttpPrincipal httpPrincipal, java.util.Date nacimiento) {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "countByNacimiento",
				_countByNacimientoParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, nacimiento);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int countBySexo(HttpPrincipal httpPrincipal, String sexo) {
		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "countBySexo",
				_countBySexoParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, sexo);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int countByTrabaja(
		HttpPrincipal httpPrincipal, boolean trabaja) {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "countByTrabaja",
				_countByTrabajaParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, trabaja);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.personas.model.Personas deletePersonas(
			HttpPrincipal httpPrincipal, String dni)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "deletePersonas",
				_deletePersonasParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, dni);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.personas.model.Personas)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findByNacimiento(
			HttpPrincipal httpPrincipal, java.util.Date nacimiento) {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "findByNacimiento",
				_findByNacimientoParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, nacimiento);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.personas.model.Personas>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findByNacimiento(
			HttpPrincipal httpPrincipal, java.util.Date nacimiento, int start,
			int end) {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "findByNacimiento",
				_findByNacimientoParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, nacimiento, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.personas.model.Personas>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findBySexo(HttpPrincipal httpPrincipal, String sexo) {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "findBySexo",
				_findBySexoParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, sexo);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.personas.model.Personas>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findBySexo(
			HttpPrincipal httpPrincipal, String sexo, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "findBySexo",
				_findBySexoParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, sexo, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.personas.model.Personas>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findByTrabaja(HttpPrincipal httpPrincipal, boolean trabaja) {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "findByTrabaja",
				_findByTrabajaParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey, trabaja);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.personas.model.Personas>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findByTrabaja(
			HttpPrincipal httpPrincipal, boolean trabaja, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "findByTrabaja",
				_findByTrabajaParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, trabaja, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.personas.model.Personas>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.personas.model.Personas updatePersonas(
			HttpPrincipal httpPrincipal, String dni, String nombre,
			String apellido1, String apellido2, java.util.Date nacimiento,
			String sexo, double altura, boolean trabaja)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PersonasServiceUtil.class, "updatePersonas",
				_updatePersonasParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, dni, nombre, apellido1, apellido2, nacimiento, sexo,
				altura, trabaja);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.personas.model.Personas)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PersonasServiceHttp.class);

	private static final Class<?>[] _addPersonasParameterTypes0 = new Class[] {
		String.class, String.class, String.class, String.class,
		java.util.Date.class, String.class, double.class, boolean.class
	};
	private static final Class<?>[] _countByNacimientoParameterTypes1 =
		new Class[] {java.util.Date.class};
	private static final Class<?>[] _countBySexoParameterTypes2 = new Class[] {
		String.class
	};
	private static final Class<?>[] _countByTrabajaParameterTypes3 =
		new Class[] {boolean.class};
	private static final Class<?>[] _deletePersonasParameterTypes4 =
		new Class[] {String.class};
	private static final Class<?>[] _findByNacimientoParameterTypes5 =
		new Class[] {java.util.Date.class};
	private static final Class<?>[] _findByNacimientoParameterTypes6 =
		new Class[] {java.util.Date.class, int.class, int.class};
	private static final Class<?>[] _findBySexoParameterTypes7 = new Class[] {
		String.class
	};
	private static final Class<?>[] _findBySexoParameterTypes8 = new Class[] {
		String.class, int.class, int.class
	};
	private static final Class<?>[] _findByTrabajaParameterTypes9 =
		new Class[] {boolean.class};
	private static final Class<?>[] _findByTrabajaParameterTypes10 =
		new Class[] {boolean.class, int.class, int.class};
	private static final Class<?>[] _updatePersonasParameterTypes11 =
		new Class[] {
			String.class, String.class, String.class, String.class,
			java.util.Date.class, String.class, double.class, boolean.class
		};

}