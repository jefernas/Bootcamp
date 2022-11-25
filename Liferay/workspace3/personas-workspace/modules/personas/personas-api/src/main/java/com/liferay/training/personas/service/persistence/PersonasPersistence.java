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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.personas.exception.NoSuchPersonasException;
import com.liferay.training.personas.model.Personas;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the personas service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonasUtil
 * @generated
 */
@ProviderType
public interface PersonasPersistence extends BasePersistence<Personas> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PersonasUtil} to access the personas persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the personases where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching personases
	 */
	public java.util.List<Personas> findByUuid(String uuid);

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
	public java.util.List<Personas> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Personas> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

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
	public java.util.List<Personas> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public Personas findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Returns the first personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public Personas fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

	/**
	 * Returns the last personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public Personas findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Returns the last personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public Personas fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

	/**
	 * Returns the personases before and after the current personas in the ordered set where uuid = &#63;.
	 *
	 * @param dni the primary key of the current personas
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public Personas[] findByUuid_PrevAndNext(
			String dni, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Removes all the personases where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of personases where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching personases
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the personases where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @return the matching personases
	 */
	public java.util.List<Personas> findByNacimiento(Date nacimiento);

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
	public java.util.List<Personas> findByNacimiento(
		Date nacimiento, int start, int end);

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
	public java.util.List<Personas> findByNacimiento(
		Date nacimiento, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

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
	public java.util.List<Personas> findByNacimiento(
		Date nacimiento, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public Personas findByNacimiento_First(
			Date nacimiento,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Returns the first personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public Personas fetchByNacimiento_First(
		Date nacimiento,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

	/**
	 * Returns the last personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public Personas findByNacimiento_Last(
			Date nacimiento,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Returns the last personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public Personas fetchByNacimiento_Last(
		Date nacimiento,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

	/**
	 * Returns the personases before and after the current personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param dni the primary key of the current personas
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public Personas[] findByNacimiento_PrevAndNext(
			String dni, Date nacimiento,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Removes all the personases where nacimiento = &#63; from the database.
	 *
	 * @param nacimiento the nacimiento
	 */
	public void removeByNacimiento(Date nacimiento);

	/**
	 * Returns the number of personases where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @return the number of matching personases
	 */
	public int countByNacimiento(Date nacimiento);

	/**
	 * Returns all the personases where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @return the matching personases
	 */
	public java.util.List<Personas> findBySexo(String sexo);

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
	public java.util.List<Personas> findBySexo(String sexo, int start, int end);

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
	public java.util.List<Personas> findBySexo(
		String sexo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

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
	public java.util.List<Personas> findBySexo(
		String sexo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public Personas findBySexo_First(
			String sexo,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Returns the first personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public Personas fetchBySexo_First(
		String sexo,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

	/**
	 * Returns the last personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public Personas findBySexo_Last(
			String sexo,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Returns the last personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public Personas fetchBySexo_Last(
		String sexo,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

	/**
	 * Returns the personases before and after the current personas in the ordered set where sexo = &#63;.
	 *
	 * @param dni the primary key of the current personas
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public Personas[] findBySexo_PrevAndNext(
			String dni, String sexo,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Removes all the personases where sexo = &#63; from the database.
	 *
	 * @param sexo the sexo
	 */
	public void removeBySexo(String sexo);

	/**
	 * Returns the number of personases where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @return the number of matching personases
	 */
	public int countBySexo(String sexo);

	/**
	 * Returns all the personases where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @return the matching personases
	 */
	public java.util.List<Personas> findByTrabaja(boolean trabaja);

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
	public java.util.List<Personas> findByTrabaja(
		boolean trabaja, int start, int end);

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
	public java.util.List<Personas> findByTrabaja(
		boolean trabaja, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

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
	public java.util.List<Personas> findByTrabaja(
		boolean trabaja, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public Personas findByTrabaja_First(
			boolean trabaja,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Returns the first personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public Personas fetchByTrabaja_First(
		boolean trabaja,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

	/**
	 * Returns the last personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	public Personas findByTrabaja_Last(
			boolean trabaja,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Returns the last personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	public Personas fetchByTrabaja_Last(
		boolean trabaja,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

	/**
	 * Returns the personases before and after the current personas in the ordered set where trabaja = &#63;.
	 *
	 * @param dni the primary key of the current personas
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public Personas[] findByTrabaja_PrevAndNext(
			String dni, boolean trabaja,
			com.liferay.portal.kernel.util.OrderByComparator<Personas>
				orderByComparator)
		throws NoSuchPersonasException;

	/**
	 * Removes all the personases where trabaja = &#63; from the database.
	 *
	 * @param trabaja the trabaja
	 */
	public void removeByTrabaja(boolean trabaja);

	/**
	 * Returns the number of personases where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @return the number of matching personases
	 */
	public int countByTrabaja(boolean trabaja);

	/**
	 * Caches the personas in the entity cache if it is enabled.
	 *
	 * @param personas the personas
	 */
	public void cacheResult(Personas personas);

	/**
	 * Caches the personases in the entity cache if it is enabled.
	 *
	 * @param personases the personases
	 */
	public void cacheResult(java.util.List<Personas> personases);

	/**
	 * Creates a new personas with the primary key. Does not add the personas to the database.
	 *
	 * @param dni the primary key for the new personas
	 * @return the new personas
	 */
	public Personas create(String dni);

	/**
	 * Removes the personas with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas that was removed
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public Personas remove(String dni) throws NoSuchPersonasException;

	public Personas updateImpl(Personas personas);

	/**
	 * Returns the personas with the primary key or throws a <code>NoSuchPersonasException</code> if it could not be found.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	public Personas findByPrimaryKey(String dni) throws NoSuchPersonasException;

	/**
	 * Returns the personas with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas, or <code>null</code> if a personas with the primary key could not be found
	 */
	public Personas fetchByPrimaryKey(String dni);

	/**
	 * Returns all the personases.
	 *
	 * @return the personases
	 */
	public java.util.List<Personas> findAll();

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
	public java.util.List<Personas> findAll(int start, int end);

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
	public java.util.List<Personas> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator);

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
	public java.util.List<Personas> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personas>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the personases from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of personases.
	 *
	 * @return the number of personases
	 */
	public int countAll();

}