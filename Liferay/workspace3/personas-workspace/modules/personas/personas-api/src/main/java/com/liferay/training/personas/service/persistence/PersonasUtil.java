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

package com.liferay.training.personas.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.personas.model.Personas;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the personas service. This utility wraps <code>com.liferay.training.personas.service.persistence.impl.PersonasPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonasPersistence
 * @generated
 */
public class PersonasUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Personas personas) {
		getPersistence().clearCache(personas);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Personas> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Personas> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Personas> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Personas> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Personas> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Personas update(Personas personas) {
		return getPersistence().update(personas);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Personas update(
		Personas personas, ServiceContext serviceContext) {

		return getPersistence().update(personas, serviceContext);
	}

	/**
	 * Returns all the personases where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching personases
	 */
	public static List<Personas> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the personases where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @return the range of matching personases
	 */
	public static List<Personas> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the personases where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching personases
	 */
	public static List<Personas> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Personas> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the personases where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching personases
	 */
	public static List<Personas> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Personas> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public static Personas findByUuid_First(
			String uuid, OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public static Personas fetchByUuid_First(
		String uuid, OrderByComparator<Personas> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public static Personas findByUuid_Last(
			String uuid, OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public static Personas fetchByUuid_Last(
		String uuid, OrderByComparator<Personas> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the personases before and after the current personas in the ordered set where uuid = &#63;.
	 *
	 * @param dni the primary key of the current personas
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public static Personas[] findByUuid_PrevAndNext(
			String dni, String uuid,
			OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findByUuid_PrevAndNext(
			dni, uuid, orderByComparator);
	}

	/**
	 * Removes all the personases where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of personases where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching personases
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the personases where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @return the matching personases
	 */
	public static List<Personas> findByNacimiento(Date nacimiento) {
		return getPersistence().findByNacimiento(nacimiento);
	}

	/**
	 * Returns a range of all the personases where nacimiento = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param nacimiento the nacimiento
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @return the range of matching personases
	 */
	public static List<Personas> findByNacimiento(
		Date nacimiento, int start, int end) {

		return getPersistence().findByNacimiento(nacimiento, start, end);
	}

	/**
	 * Returns an ordered range of all the personases where nacimiento = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param nacimiento the nacimiento
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching personases
	 */
	public static List<Personas> findByNacimiento(
		Date nacimiento, int start, int end,
		OrderByComparator<Personas> orderByComparator) {

		return getPersistence().findByNacimiento(
			nacimiento, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the personases where nacimiento = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param nacimiento the nacimiento
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching personases
	 */
	public static List<Personas> findByNacimiento(
		Date nacimiento, int start, int end,
		OrderByComparator<Personas> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByNacimiento(
			nacimiento, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public static Personas findByNacimiento_First(
			Date nacimiento, OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findByNacimiento_First(
			nacimiento, orderByComparator);
	}

	/**
	 * Returns the first personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public static Personas fetchByNacimiento_First(
		Date nacimiento, OrderByComparator<Personas> orderByComparator) {

		return getPersistence().fetchByNacimiento_First(
			nacimiento, orderByComparator);
	}

	/**
	 * Returns the last personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public static Personas findByNacimiento_Last(
			Date nacimiento, OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findByNacimiento_Last(
			nacimiento, orderByComparator);
	}

	/**
	 * Returns the last personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public static Personas fetchByNacimiento_Last(
		Date nacimiento, OrderByComparator<Personas> orderByComparator) {

		return getPersistence().fetchByNacimiento_Last(
			nacimiento, orderByComparator);
	}

	/**
	 * Returns the personases before and after the current personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param dni the primary key of the current personas
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public static Personas[] findByNacimiento_PrevAndNext(
			String dni, Date nacimiento,
			OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findByNacimiento_PrevAndNext(
			dni, nacimiento, orderByComparator);
	}

	/**
	 * Removes all the personases where nacimiento = &#63; from the database.
	 *
	 * @param nacimiento the nacimiento
	 */
	public static void removeByNacimiento(Date nacimiento) {
		getPersistence().removeByNacimiento(nacimiento);
	}

	/**
	 * Returns the number of personases where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @return the number of matching personases
	 */
	public static int countByNacimiento(Date nacimiento) {
		return getPersistence().countByNacimiento(nacimiento);
	}

	/**
	 * Returns all the personases where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @return the matching personases
	 */
	public static List<Personas> findBySexo(String sexo) {
		return getPersistence().findBySexo(sexo);
	}

	/**
	 * Returns a range of all the personases where sexo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param sexo the sexo
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @return the range of matching personases
	 */
	public static List<Personas> findBySexo(String sexo, int start, int end) {
		return getPersistence().findBySexo(sexo, start, end);
	}

	/**
	 * Returns an ordered range of all the personases where sexo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param sexo the sexo
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching personases
	 */
	public static List<Personas> findBySexo(
		String sexo, int start, int end,
		OrderByComparator<Personas> orderByComparator) {

		return getPersistence().findBySexo(sexo, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the personases where sexo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param sexo the sexo
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching personases
	 */
	public static List<Personas> findBySexo(
		String sexo, int start, int end,
		OrderByComparator<Personas> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBySexo(
			sexo, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public static Personas findBySexo_First(
			String sexo, OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findBySexo_First(sexo, orderByComparator);
	}

	/**
	 * Returns the first personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public static Personas fetchBySexo_First(
		String sexo, OrderByComparator<Personas> orderByComparator) {

		return getPersistence().fetchBySexo_First(sexo, orderByComparator);
	}

	/**
	 * Returns the last personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public static Personas findBySexo_Last(
			String sexo, OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findBySexo_Last(sexo, orderByComparator);
	}

	/**
	 * Returns the last personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public static Personas fetchBySexo_Last(
		String sexo, OrderByComparator<Personas> orderByComparator) {

		return getPersistence().fetchBySexo_Last(sexo, orderByComparator);
	}

	/**
	 * Returns the personases before and after the current personas in the ordered set where sexo = &#63;.
	 *
	 * @param dni the primary key of the current personas
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public static Personas[] findBySexo_PrevAndNext(
			String dni, String sexo,
			OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findBySexo_PrevAndNext(
			dni, sexo, orderByComparator);
	}

	/**
	 * Removes all the personases where sexo = &#63; from the database.
	 *
	 * @param sexo the sexo
	 */
	public static void removeBySexo(String sexo) {
		getPersistence().removeBySexo(sexo);
	}

	/**
	 * Returns the number of personases where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @return the number of matching personases
	 */
	public static int countBySexo(String sexo) {
		return getPersistence().countBySexo(sexo);
	}

	/**
	 * Returns all the personases where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @return the matching personases
	 */
	public static List<Personas> findByTrabaja(boolean trabaja) {
		return getPersistence().findByTrabaja(trabaja);
	}

	/**
	 * Returns a range of all the personases where trabaja = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param trabaja the trabaja
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @return the range of matching personases
	 */
	public static List<Personas> findByTrabaja(
		boolean trabaja, int start, int end) {

		return getPersistence().findByTrabaja(trabaja, start, end);
	}

	/**
	 * Returns an ordered range of all the personases where trabaja = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param trabaja the trabaja
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching personases
	 */
	public static List<Personas> findByTrabaja(
		boolean trabaja, int start, int end,
		OrderByComparator<Personas> orderByComparator) {

		return getPersistence().findByTrabaja(
			trabaja, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the personases where trabaja = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param trabaja the trabaja
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching personases
	 */
	public static List<Personas> findByTrabaja(
		boolean trabaja, int start, int end,
		OrderByComparator<Personas> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByTrabaja(
			trabaja, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public static Personas findByTrabaja_First(
			boolean trabaja, OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findByTrabaja_First(trabaja, orderByComparator);
	}

	/**
	 * Returns the first personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public static Personas fetchByTrabaja_First(
		boolean trabaja, OrderByComparator<Personas> orderByComparator) {

		return getPersistence().fetchByTrabaja_First(
			trabaja, orderByComparator);
	}

	/**
	 * Returns the last personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public static Personas findByTrabaja_Last(
			boolean trabaja, OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findByTrabaja_Last(trabaja, orderByComparator);
	}

	/**
	 * Returns the last personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public static Personas fetchByTrabaja_Last(
		boolean trabaja, OrderByComparator<Personas> orderByComparator) {

		return getPersistence().fetchByTrabaja_Last(trabaja, orderByComparator);
	}

	/**
	 * Returns the personases before and after the current personas in the ordered set where trabaja = &#63;.
	 *
	 * @param dni the primary key of the current personas
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public static Personas[] findByTrabaja_PrevAndNext(
			String dni, boolean trabaja,
			OrderByComparator<Personas> orderByComparator)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findByTrabaja_PrevAndNext(
			dni, trabaja, orderByComparator);
	}

	/**
	 * Removes all the personases where trabaja = &#63; from the database.
	 *
	 * @param trabaja the trabaja
	 */
	public static void removeByTrabaja(boolean trabaja) {
		getPersistence().removeByTrabaja(trabaja);
	}

	/**
	 * Returns the number of personases where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @return the number of matching personases
	 */
	public static int countByTrabaja(boolean trabaja) {
		return getPersistence().countByTrabaja(trabaja);
	}

	/**
	 * Caches the personas in the entity cache if it is enabled.
	 *
	 * @param personas the personas
	 */
	public static void cacheResult(Personas personas) {
		getPersistence().cacheResult(personas);
	}

	/**
	 * Caches the personases in the entity cache if it is enabled.
	 *
	 * @param personases the personases
	 */
	public static void cacheResult(List<Personas> personases) {
		getPersistence().cacheResult(personases);
	}

	/**
	 * Creates a new personas with the primary key. Does not add the personas to the database.
	 *
	 * @param dni the primary key for the new personas
	 * @return the new personas
	 */
	public static Personas create(String dni) {
		return getPersistence().create(dni);
	}

	/**
	 * Removes the personas with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas that was removed
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public static Personas remove(String dni)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().remove(dni);
	}

	public static Personas updateImpl(Personas personas) {
		return getPersistence().updateImpl(personas);
	}

	/**
	 * Returns the personas with the primary key or throws a <code>NoSuchPersonasException</code> if it could not be found.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public static Personas findByPrimaryKey(String dni)
		throws com.liferay.training.personas.exception.NoSuchPersonasException {

		return getPersistence().findByPrimaryKey(dni);
	}

	/**
	 * Returns the personas with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas, or <code>null</code> if a personas with the primary key could not be found
	 */
	public static Personas fetchByPrimaryKey(String dni) {
		return getPersistence().fetchByPrimaryKey(dni);
	}

	/**
	 * Returns all the personases.
	 *
	 * @return the personases
	 */
	public static List<Personas> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the personases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @return the range of personases
	 */
	public static List<Personas> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the personases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of personases
	 */
	public static List<Personas> findAll(
		int start, int end, OrderByComparator<Personas> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the personases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonasModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personases
	 * @param end the upper bound of the range of personases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of personases
	 */
	public static List<Personas> findAll(
		int start, int end, OrderByComparator<Personas> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the personases from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of personases.
	 *
	 * @return the number of personases
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PersonasPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PersonasPersistence, PersonasPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PersonasPersistence.class);

		ServiceTracker<PersonasPersistence, PersonasPersistence>
			serviceTracker =
				new ServiceTracker<PersonasPersistence, PersonasPersistence>(
					bundle.getBundleContext(), PersonasPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}