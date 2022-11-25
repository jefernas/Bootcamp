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
 * Provides the local service utility for Personas. This utility wraps
 * <code>com.liferay.training.personas.service.impl.PersonasLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PersonasLocalService
 * @generated
 */
public class PersonasLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.personas.service.impl.PersonasLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the personas to the database. Also notifies the appropriate model listeners.
	 *
	 * @param personas the personas
	 * @return the personas that was added
	 */
	public static com.liferay.training.personas.model.Personas addPersonas(
		com.liferay.training.personas.model.Personas personas) {

		return getService().addPersonas(personas);
	}

	public static com.liferay.training.personas.model.Personas addPersonas(
		String dni, String nombre, String apellido1, String apellido2,
		java.util.Date nacimiento, String sexo, double altura,
		boolean trabaja) {

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

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new personas with the primary key. Does not add the personas to the database.
	 *
	 * @param dni the primary key for the new personas
	 * @return the new personas
	 */
	public static com.liferay.training.personas.model.Personas createPersonas(
		String dni) {

		return getService().createPersonas(dni);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the personas from the database. Also notifies the appropriate model listeners.
	 *
	 * @param personas the personas
	 * @return the personas that was removed
	 */
	public static com.liferay.training.personas.model.Personas deletePersonas(
		com.liferay.training.personas.model.Personas personas) {

		return getService().deletePersonas(personas);
	}

	/**
	 * Deletes the personas with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas that was removed
	 * @throws PortalException if a personas with the primary key could not be found
	 */
	public static com.liferay.training.personas.model.Personas deletePersonas(
			String dni)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersonas(dni);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.training.personas.model.Personas fetchPersonas(
		String dni) {

		return getService().fetchPersonas(dni);
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

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the personas with the primary key.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas
	 * @throws PortalException if a personas with the primary key could not be found
	 */
	public static com.liferay.training.personas.model.Personas getPersonas(
			String dni)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersonas(dni);
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
	public static java.util.List<com.liferay.training.personas.model.Personas>
		getPersonases(int start, int end) {

		return getService().getPersonases(start, end);
	}

	/**
	 * Returns the number of personases.
	 *
	 * @return the number of personases
	 */
	public static int getPersonasesCount() {
		return getService().getPersonasesCount();
	}

	/**
	 * Updates the personas in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param personas the personas
	 * @return the personas that was updated
	 */
	public static com.liferay.training.personas.model.Personas updatePersonas(
		com.liferay.training.personas.model.Personas personas) {

		return getService().updatePersonas(personas);
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

	public static PersonasLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PersonasLocalService, PersonasLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PersonasLocalService.class);

		ServiceTracker<PersonasLocalService, PersonasLocalService>
			serviceTracker =
				new ServiceTracker<PersonasLocalService, PersonasLocalService>(
					bundle.getBundleContext(), PersonasLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}