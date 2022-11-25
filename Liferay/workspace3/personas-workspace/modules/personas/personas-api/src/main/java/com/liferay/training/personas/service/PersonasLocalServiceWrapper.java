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
 * Provides a wrapper for {@link PersonasLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PersonasLocalService
 * @generated
 */
public class PersonasLocalServiceWrapper
	implements PersonasLocalService, ServiceWrapper<PersonasLocalService> {

	public PersonasLocalServiceWrapper(
		PersonasLocalService personasLocalService) {

		_personasLocalService = personasLocalService;
	}

	/**
	 * Adds the personas to the database. Also notifies the appropriate model listeners.
	 *
	 * @param personas the personas
	 * @return the personas that was added
	 */
	@Override
	public com.liferay.training.personas.model.Personas addPersonas(
		com.liferay.training.personas.model.Personas personas) {

		return _personasLocalService.addPersonas(personas);
	}

	@Override
	public com.liferay.training.personas.model.Personas addPersonas(
		String dni, String nombre, String apellido1, String apellido2,
		java.util.Date nacimiento, String sexo, double altura,
		boolean trabaja) {

		return _personasLocalService.addPersonas(
			dni, nombre, apellido1, apellido2, nacimiento, sexo, altura,
			trabaja);
	}

	@Override
	public int countByNacimiento(java.util.Date nacimiento) {
		return _personasLocalService.countByNacimiento(nacimiento);
	}

	@Override
	public int countBySexo(String sexo) {
		return _personasLocalService.countBySexo(sexo);
	}

	@Override
	public int countByTrabaja(boolean trabaja) {
		return _personasLocalService.countByTrabaja(trabaja);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personasLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new personas with the primary key. Does not add the personas to the database.
	 *
	 * @param dni the primary key for the new personas
	 * @return the new personas
	 */
	@Override
	public com.liferay.training.personas.model.Personas createPersonas(
		String dni) {

		return _personasLocalService.createPersonas(dni);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personasLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the personas from the database. Also notifies the appropriate model listeners.
	 *
	 * @param personas the personas
	 * @return the personas that was removed
	 */
	@Override
	public com.liferay.training.personas.model.Personas deletePersonas(
		com.liferay.training.personas.model.Personas personas) {

		return _personasLocalService.deletePersonas(personas);
	}

	/**
	 * Deletes the personas with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas that was removed
	 * @throws PortalException if a personas with the primary key could not be found
	 */
	@Override
	public com.liferay.training.personas.model.Personas deletePersonas(
			String dni)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personasLocalService.deletePersonas(dni);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _personasLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _personasLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.personas.model.impl.PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _personasLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.personas.model.impl.PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _personasLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _personasLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _personasLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.personas.model.Personas fetchPersonas(
		String dni) {

		return _personasLocalService.fetchPersonas(dni);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findByNacimiento(java.util.Date nacimiento) {

		return _personasLocalService.findByNacimiento(nacimiento);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findByNacimiento(java.util.Date nacimiento, int start, int end) {

		return _personasLocalService.findByNacimiento(nacimiento, start, end);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findBySexo(String sexo) {

		return _personasLocalService.findBySexo(sexo);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findBySexo(String sexo, int start, int end) {

		return _personasLocalService.findBySexo(sexo, start, end);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findByTrabaja(boolean trabaja) {

		return _personasLocalService.findByTrabaja(trabaja);
	}

	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		findByTrabaja(boolean trabaja, int start, int end) {

		return _personasLocalService.findByTrabaja(trabaja, start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _personasLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personasLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the personas with the primary key.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas
	 * @throws PortalException if a personas with the primary key could not be found
	 */
	@Override
	public com.liferay.training.personas.model.Personas getPersonas(String dni)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personasLocalService.getPersonas(dni);
	}

	/**
	 * Returns a range of all the personases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.personas.model.impl.PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @return the range of personases
	 */
	@Override
	public java.util.List<com.liferay.training.personas.model.Personas>
		getPersonases(int start, int end) {

		return _personasLocalService.getPersonases(start, end);
	}

	/**
	 * Returns the number of personases.
	 *
	 * @return the number of personases
	 */
	@Override
	public int getPersonasesCount() {
		return _personasLocalService.getPersonasesCount();
	}

	/**
	 * Updates the personas in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param personas the personas
	 * @return the personas that was updated
	 */
	@Override
	public com.liferay.training.personas.model.Personas updatePersonas(
		com.liferay.training.personas.model.Personas personas) {

		return _personasLocalService.updatePersonas(personas);
	}

	@Override
	public com.liferay.training.personas.model.Personas updatePersonas(
			String dni, String nombre, String apellido1, String apellido2,
			java.util.Date nacimiento, String sexo, double altura,
			boolean trabaja)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personasLocalService.updatePersonas(
			dni, nombre, apellido1, apellido2, nacimiento, sexo, altura,
			trabaja);
	}

	@Override
	public PersonasLocalService getWrappedService() {
		return _personasLocalService;
	}

	@Override
	public void setWrappedService(PersonasLocalService personasLocalService) {
		_personasLocalService = personasLocalService;
	}

	private PersonasLocalService _personasLocalService;

}