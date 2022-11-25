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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PersonasService}.
 *
 * @author Brian Wing Shun Chan
 * @see PersonasService
 * @generated
 */
public class PersonasServiceWrapper
	implements PersonasService, ServiceWrapper<PersonasService> {

	public PersonasServiceWrapper(PersonasService personasService) {
		_personasService = personasService;
	}

	@Override
	public com.liferay.training.personas.model.Personas addPersonas(
			String dni, String nombre, String apellido1, String apellido2,
			java.util.Date nacimiento, String sexo, double altura,
			boolean trabaja)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personasService.addPersonas(
			dni, nombre, apellido1, apellido2, nacimiento, sexo, altura,
			trabaja);
	}

	@Override
	public int countByNacimiento(java.util.Date nacimiento) {
		return _personasService.countByNacimiento(nacimiento);
	}

	@Override
	public int countBySexo(String sexo) {
		return _personasService.countBySexo(sexo);
	}

	@Override
	public int countByTrabaja(boolean trabaja) {
		return _personasService.countByTrabaja(trabaja);
	}

	@Override
	public com.liferay.training.personas.model.Personas deletePersonas(
			String dni)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personasService.deletePersonas(dni);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findByNacimiento(java.util.Date nacimiento) {

		return _personasService.findByNacimiento(nacimiento);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findByNacimiento(java.util.Date nacimiento, int start, int end) {

		return _personasService.findByNacimiento(nacimiento, start, end);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findBySexo(String sexo) {

		return _personasService.findBySexo(sexo);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findBySexo(String sexo, int start, int end) {

		return _personasService.findBySexo(sexo, start, end);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findByTrabaja(boolean trabaja) {

		return _personasService.findByTrabaja(trabaja);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findByTrabaja(boolean trabaja, int start, int end) {

		return _personasService.findByTrabaja(trabaja, start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _personasService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.personas.model.Personas updatePersonas(
			String dni, String nombre, String apellido1, String apellido2,
			java.util.Date nacimiento, String sexo, double altura,
			boolean trabaja)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personasService.updatePersonas(
			dni, nombre, apellido1, apellido2, nacimiento, sexo, altura,
			trabaja);
	}

	@Override
	public PersonasService getWrappedService() {
		return _personasService;
	}

	@Override
	public void setWrappedService(PersonasService personasService) {
		_personasService = personasService;
	}

	private PersonasService _personasService;

}