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

package com.liferay.training.personas.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Personas. This utility wraps
 * <code>com.liferay.training.personas.service.impl.PersonasServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PersonasService
 * @generated
 */
public class PersonasServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.personas.service.impl.PersonasServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.personas.model.Personas addPersonas(
			String dni, String nombre, String apellido1, String apellido2,
			java.util.Date nacimiento, String sexo, double altura,
			boolean trabaja)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addPersonas(
			dni, nombre, apellido1, apellido2, nacimiento, sexo, altura,
			trabaja);
	}

	public static int countByNacimiento(java.util.Date nacimiento) {
		return getService().countByNacimiento(nacimiento);
	}

	public static int countBySexo(String sexo) {
		return getService().countBySexo(sexo);
	}

	public static int countByTrabaja(boolean trabaja) {
		return getService().countByTrabaja(trabaja);
	}

	public static com.liferay.training.personas.model.Personas deletePersonas(
			String dni)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersonas(dni);
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findByNacimiento(java.util.Date nacimiento) {

		return getService().findByNacimiento(nacimiento);
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findByNacimiento(java.util.Date nacimiento, int start, int end) {

		return getService().findByNacimiento(nacimiento, start, end);
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findBySexo(String sexo) {

		return getService().findBySexo(sexo);
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findBySexo(String sexo, int start, int end) {

		return getService().findBySexo(sexo, start, end);
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findByTrabaja(boolean trabaja) {

		return getService().findByTrabaja(trabaja);
	}

	public static java.util.List<com.liferay.training.personas.model.Personas>
		findByTrabaja(boolean trabaja, int start, int end) {

		return getService().findByTrabaja(trabaja, start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.training.personas.model.Personas updatePersonas(
			String dni, String nombre, String apellido1, String apellido2,
			java.util.Date nacimiento, String sexo, double altura,
			boolean trabaja)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updatePersonas(
			dni, nombre, apellido1, apellido2, nacimiento, sexo, altura,
			trabaja);
	}

	public static PersonasService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PersonasService, PersonasService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PersonasService.class);

		ServiceTracker<PersonasService, PersonasService> serviceTracker =
			new ServiceTracker<PersonasService, PersonasService>(
				bundle.getBundleContext(), PersonasService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}