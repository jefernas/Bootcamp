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

package com.liferay.training.personas.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.training.personas.exception.NoSuchPersonasException;
import com.liferay.training.personas.model.Personas;
import com.liferay.training.personas.model.impl.PersonasImpl;
import com.liferay.training.personas.model.impl.PersonasModelImpl;
import com.liferay.training.personas.service.persistence.PersonasPersistence;
import com.liferay.training.personas.service.persistence.impl.constants.PersonasPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Timestamp;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the personas service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PersonasPersistence.class)
public class PersonasPersistenceImpl
	extends BasePersistenceImpl<Personas> implements PersonasPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PersonasUtil</code> to access the personas persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PersonasImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the personases where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching personases
	 */
	@Override
	public List<Personas> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Personas> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Personas> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Personas> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Personas> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Personas> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Personas> list = null;

		if (useFinderCache) {
			list = (List<Personas>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Personas personas : list) {
					if (!uuid.equals(personas.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PERSONAS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersonasModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Personas>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	@Override
	public Personas findByUuid_First(
			String uuid, OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		Personas personas = fetchByUuid_First(uuid, orderByComparator);

		if (personas != null) {
			return personas;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPersonasException(sb.toString());
	}

	/**
	 * Returns the first personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	@Override
	public Personas fetchByUuid_First(
		String uuid, OrderByComparator<Personas> orderByComparator) {

		List<Personas> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	@Override
	public Personas findByUuid_Last(
			String uuid, OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		Personas personas = fetchByUuid_Last(uuid, orderByComparator);

		if (personas != null) {
			return personas;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPersonasException(sb.toString());
	}

	/**
	 * Returns the last personas in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	@Override
	public Personas fetchByUuid_Last(
		String uuid, OrderByComparator<Personas> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Personas> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Personas[] findByUuid_PrevAndNext(
			String dni, String uuid,
			OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		uuid = Objects.toString(uuid, "");

		Personas personas = findByPrimaryKey(dni);

		Session session = null;

		try {
			session = openSession();

			Personas[] array = new PersonasImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, personas, uuid, orderByComparator, true);

			array[1] = personas;

			array[2] = getByUuid_PrevAndNext(
				session, personas, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Personas getByUuid_PrevAndNext(
		Session session, Personas personas, String uuid,
		OrderByComparator<Personas> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PERSONAS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PersonasModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(personas)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Personas> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the personases where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Personas personas :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(personas);
		}
	}

	/**
	 * Returns the number of personases where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching personases
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSONAS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"personas.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(personas.uuid IS NULL OR personas.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByNacimiento;
	private FinderPath _finderPathWithoutPaginationFindByNacimiento;
	private FinderPath _finderPathCountByNacimiento;

	/**
	 * Returns all the personases where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @return the matching personases
	 */
	@Override
	public List<Personas> findByNacimiento(Date nacimiento) {
		return findByNacimiento(
			nacimiento, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Personas> findByNacimiento(
		Date nacimiento, int start, int end) {

		return findByNacimiento(nacimiento, start, end, null);
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
	@Override
	public List<Personas> findByNacimiento(
		Date nacimiento, int start, int end,
		OrderByComparator<Personas> orderByComparator) {

		return findByNacimiento(
			nacimiento, start, end, orderByComparator, true);
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
	@Override
	public List<Personas> findByNacimiento(
		Date nacimiento, int start, int end,
		OrderByComparator<Personas> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByNacimiento;
				finderArgs = new Object[] {_getTime(nacimiento)};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByNacimiento;
			finderArgs = new Object[] {
				_getTime(nacimiento), start, end, orderByComparator
			};
		}

		List<Personas> list = null;

		if (useFinderCache) {
			list = (List<Personas>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Personas personas : list) {
					if (!Objects.equals(nacimiento, personas.getNacimiento())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PERSONAS_WHERE);

			boolean bindNacimiento = false;

			if (nacimiento == null) {
				sb.append(_FINDER_COLUMN_NACIMIENTO_NACIMIENTO_1);
			}
			else {
				bindNacimiento = true;

				sb.append(_FINDER_COLUMN_NACIMIENTO_NACIMIENTO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersonasModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNacimiento) {
					queryPos.add(new Timestamp(nacimiento.getTime()));
				}

				list = (List<Personas>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	@Override
	public Personas findByNacimiento_First(
			Date nacimiento, OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		Personas personas = fetchByNacimiento_First(
			nacimiento, orderByComparator);

		if (personas != null) {
			return personas;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nacimiento=");
		sb.append(nacimiento);

		sb.append("}");

		throw new NoSuchPersonasException(sb.toString());
	}

	/**
	 * Returns the first personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	@Override
	public Personas fetchByNacimiento_First(
		Date nacimiento, OrderByComparator<Personas> orderByComparator) {

		List<Personas> list = findByNacimiento(
			nacimiento, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	@Override
	public Personas findByNacimiento_Last(
			Date nacimiento, OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		Personas personas = fetchByNacimiento_Last(
			nacimiento, orderByComparator);

		if (personas != null) {
			return personas;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nacimiento=");
		sb.append(nacimiento);

		sb.append("}");

		throw new NoSuchPersonasException(sb.toString());
	}

	/**
	 * Returns the last personas in the ordered set where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	@Override
	public Personas fetchByNacimiento_Last(
		Date nacimiento, OrderByComparator<Personas> orderByComparator) {

		int count = countByNacimiento(nacimiento);

		if (count == 0) {
			return null;
		}

		List<Personas> list = findByNacimiento(
			nacimiento, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Personas[] findByNacimiento_PrevAndNext(
			String dni, Date nacimiento,
			OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		Personas personas = findByPrimaryKey(dni);

		Session session = null;

		try {
			session = openSession();

			Personas[] array = new PersonasImpl[3];

			array[0] = getByNacimiento_PrevAndNext(
				session, personas, nacimiento, orderByComparator, true);

			array[1] = personas;

			array[2] = getByNacimiento_PrevAndNext(
				session, personas, nacimiento, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Personas getByNacimiento_PrevAndNext(
		Session session, Personas personas, Date nacimiento,
		OrderByComparator<Personas> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PERSONAS_WHERE);

		boolean bindNacimiento = false;

		if (nacimiento == null) {
			sb.append(_FINDER_COLUMN_NACIMIENTO_NACIMIENTO_1);
		}
		else {
			bindNacimiento = true;

			sb.append(_FINDER_COLUMN_NACIMIENTO_NACIMIENTO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PersonasModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindNacimiento) {
			queryPos.add(new Timestamp(nacimiento.getTime()));
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(personas)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Personas> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the personases where nacimiento = &#63; from the database.
	 *
	 * @param nacimiento the nacimiento
	 */
	@Override
	public void removeByNacimiento(Date nacimiento) {
		for (Personas personas :
				findByNacimiento(
					nacimiento, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(personas);
		}
	}

	/**
	 * Returns the number of personases where nacimiento = &#63;.
	 *
	 * @param nacimiento the nacimiento
	 * @return the number of matching personases
	 */
	@Override
	public int countByNacimiento(Date nacimiento) {
		FinderPath finderPath = _finderPathCountByNacimiento;

		Object[] finderArgs = new Object[] {_getTime(nacimiento)};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSONAS_WHERE);

			boolean bindNacimiento = false;

			if (nacimiento == null) {
				sb.append(_FINDER_COLUMN_NACIMIENTO_NACIMIENTO_1);
			}
			else {
				bindNacimiento = true;

				sb.append(_FINDER_COLUMN_NACIMIENTO_NACIMIENTO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNacimiento) {
					queryPos.add(new Timestamp(nacimiento.getTime()));
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_NACIMIENTO_NACIMIENTO_1 =
		"personas.nacimiento IS NULL";

	private static final String _FINDER_COLUMN_NACIMIENTO_NACIMIENTO_2 =
		"personas.nacimiento = ?";

	private FinderPath _finderPathWithPaginationFindBySexo;
	private FinderPath _finderPathWithoutPaginationFindBySexo;
	private FinderPath _finderPathCountBySexo;

	/**
	 * Returns all the personases where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @return the matching personases
	 */
	@Override
	public List<Personas> findBySexo(String sexo) {
		return findBySexo(sexo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Personas> findBySexo(String sexo, int start, int end) {
		return findBySexo(sexo, start, end, null);
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
	@Override
	public List<Personas> findBySexo(
		String sexo, int start, int end,
		OrderByComparator<Personas> orderByComparator) {

		return findBySexo(sexo, start, end, orderByComparator, true);
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
	@Override
	public List<Personas> findBySexo(
		String sexo, int start, int end,
		OrderByComparator<Personas> orderByComparator, boolean useFinderCache) {

		sexo = Objects.toString(sexo, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBySexo;
				finderArgs = new Object[] {sexo};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBySexo;
			finderArgs = new Object[] {sexo, start, end, orderByComparator};
		}

		List<Personas> list = null;

		if (useFinderCache) {
			list = (List<Personas>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Personas personas : list) {
					if (!sexo.equals(personas.getSexo())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PERSONAS_WHERE);

			boolean bindSexo = false;

			if (sexo.isEmpty()) {
				sb.append(_FINDER_COLUMN_SEXO_SEXO_3);
			}
			else {
				bindSexo = true;

				sb.append(_FINDER_COLUMN_SEXO_SEXO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersonasModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindSexo) {
					queryPos.add(sexo);
				}

				list = (List<Personas>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	@Override
	public Personas findBySexo_First(
			String sexo, OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		Personas personas = fetchBySexo_First(sexo, orderByComparator);

		if (personas != null) {
			return personas;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sexo=");
		sb.append(sexo);

		sb.append("}");

		throw new NoSuchPersonasException(sb.toString());
	}

	/**
	 * Returns the first personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	@Override
	public Personas fetchBySexo_First(
		String sexo, OrderByComparator<Personas> orderByComparator) {

		List<Personas> list = findBySexo(sexo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	@Override
	public Personas findBySexo_Last(
			String sexo, OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		Personas personas = fetchBySexo_Last(sexo, orderByComparator);

		if (personas != null) {
			return personas;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sexo=");
		sb.append(sexo);

		sb.append("}");

		throw new NoSuchPersonasException(sb.toString());
	}

	/**
	 * Returns the last personas in the ordered set where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	@Override
	public Personas fetchBySexo_Last(
		String sexo, OrderByComparator<Personas> orderByComparator) {

		int count = countBySexo(sexo);

		if (count == 0) {
			return null;
		}

		List<Personas> list = findBySexo(
			sexo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Personas[] findBySexo_PrevAndNext(
			String dni, String sexo,
			OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		sexo = Objects.toString(sexo, "");

		Personas personas = findByPrimaryKey(dni);

		Session session = null;

		try {
			session = openSession();

			Personas[] array = new PersonasImpl[3];

			array[0] = getBySexo_PrevAndNext(
				session, personas, sexo, orderByComparator, true);

			array[1] = personas;

			array[2] = getBySexo_PrevAndNext(
				session, personas, sexo, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Personas getBySexo_PrevAndNext(
		Session session, Personas personas, String sexo,
		OrderByComparator<Personas> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PERSONAS_WHERE);

		boolean bindSexo = false;

		if (sexo.isEmpty()) {
			sb.append(_FINDER_COLUMN_SEXO_SEXO_3);
		}
		else {
			bindSexo = true;

			sb.append(_FINDER_COLUMN_SEXO_SEXO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PersonasModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindSexo) {
			queryPos.add(sexo);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(personas)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Personas> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the personases where sexo = &#63; from the database.
	 *
	 * @param sexo the sexo
	 */
	@Override
	public void removeBySexo(String sexo) {
		for (Personas personas :
				findBySexo(sexo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(personas);
		}
	}

	/**
	 * Returns the number of personases where sexo = &#63;.
	 *
	 * @param sexo the sexo
	 * @return the number of matching personases
	 */
	@Override
	public int countBySexo(String sexo) {
		sexo = Objects.toString(sexo, "");

		FinderPath finderPath = _finderPathCountBySexo;

		Object[] finderArgs = new Object[] {sexo};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSONAS_WHERE);

			boolean bindSexo = false;

			if (sexo.isEmpty()) {
				sb.append(_FINDER_COLUMN_SEXO_SEXO_3);
			}
			else {
				bindSexo = true;

				sb.append(_FINDER_COLUMN_SEXO_SEXO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindSexo) {
					queryPos.add(sexo);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_SEXO_SEXO_2 =
		"personas.sexo = ?";

	private static final String _FINDER_COLUMN_SEXO_SEXO_3 =
		"(personas.sexo IS NULL OR personas.sexo = '')";

	private FinderPath _finderPathWithPaginationFindByTrabaja;
	private FinderPath _finderPathWithoutPaginationFindByTrabaja;
	private FinderPath _finderPathCountByTrabaja;

	/**
	 * Returns all the personases where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @return the matching personases
	 */
	@Override
	public List<Personas> findByTrabaja(boolean trabaja) {
		return findByTrabaja(
			trabaja, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Personas> findByTrabaja(boolean trabaja, int start, int end) {
		return findByTrabaja(trabaja, start, end, null);
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
	@Override
	public List<Personas> findByTrabaja(
		boolean trabaja, int start, int end,
		OrderByComparator<Personas> orderByComparator) {

		return findByTrabaja(trabaja, start, end, orderByComparator, true);
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
	@Override
	public List<Personas> findByTrabaja(
		boolean trabaja, int start, int end,
		OrderByComparator<Personas> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByTrabaja;
				finderArgs = new Object[] {trabaja};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByTrabaja;
			finderArgs = new Object[] {trabaja, start, end, orderByComparator};
		}

		List<Personas> list = null;

		if (useFinderCache) {
			list = (List<Personas>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Personas personas : list) {
					if (trabaja != personas.isTrabaja()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PERSONAS_WHERE);

			sb.append(_FINDER_COLUMN_TRABAJA_TRABAJA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersonasModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(trabaja);

				list = (List<Personas>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	@Override
	public Personas findByTrabaja_First(
			boolean trabaja, OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		Personas personas = fetchByTrabaja_First(trabaja, orderByComparator);

		if (personas != null) {
			return personas;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("trabaja=");
		sb.append(trabaja);

		sb.append("}");

		throw new NoSuchPersonasException(sb.toString());
	}

	/**
	 * Returns the first personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personas, or <code>null</code> if a matching personas could not be found
	 */
	@Override
	public Personas fetchByTrabaja_First(
		boolean trabaja, OrderByComparator<Personas> orderByComparator) {

		List<Personas> list = findByTrabaja(trabaja, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas
	 * @throws NoSuchPersonasException if a matching personas could not be found
	 */
	@Override
	public Personas findByTrabaja_Last(
			boolean trabaja, OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		Personas personas = fetchByTrabaja_Last(trabaja, orderByComparator);

		if (personas != null) {
			return personas;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("trabaja=");
		sb.append(trabaja);

		sb.append("}");

		throw new NoSuchPersonasException(sb.toString());
	}

	/**
	 * Returns the last personas in the ordered set where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personas, or <code>null</code> if a matching personas could not be found
	 */
	@Override
	public Personas fetchByTrabaja_Last(
		boolean trabaja, OrderByComparator<Personas> orderByComparator) {

		int count = countByTrabaja(trabaja);

		if (count == 0) {
			return null;
		}

		List<Personas> list = findByTrabaja(
			trabaja, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Personas[] findByTrabaja_PrevAndNext(
			String dni, boolean trabaja,
			OrderByComparator<Personas> orderByComparator)
		throws NoSuchPersonasException {

		Personas personas = findByPrimaryKey(dni);

		Session session = null;

		try {
			session = openSession();

			Personas[] array = new PersonasImpl[3];

			array[0] = getByTrabaja_PrevAndNext(
				session, personas, trabaja, orderByComparator, true);

			array[1] = personas;

			array[2] = getByTrabaja_PrevAndNext(
				session, personas, trabaja, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Personas getByTrabaja_PrevAndNext(
		Session session, Personas personas, boolean trabaja,
		OrderByComparator<Personas> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PERSONAS_WHERE);

		sb.append(_FINDER_COLUMN_TRABAJA_TRABAJA_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PersonasModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(trabaja);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(personas)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Personas> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the personases where trabaja = &#63; from the database.
	 *
	 * @param trabaja the trabaja
	 */
	@Override
	public void removeByTrabaja(boolean trabaja) {
		for (Personas personas :
				findByTrabaja(
					trabaja, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(personas);
		}
	}

	/**
	 * Returns the number of personases where trabaja = &#63;.
	 *
	 * @param trabaja the trabaja
	 * @return the number of matching personases
	 */
	@Override
	public int countByTrabaja(boolean trabaja) {
		FinderPath finderPath = _finderPathCountByTrabaja;

		Object[] finderArgs = new Object[] {trabaja};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSONAS_WHERE);

			sb.append(_FINDER_COLUMN_TRABAJA_TRABAJA_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(trabaja);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TRABAJA_TRABAJA_2 =
		"personas.trabaja = ?";

	public PersonasPersistenceImpl() {
		setModelClass(Personas.class);

		setModelImplClass(PersonasImpl.class);
		setModelPKClass(String.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the personas in the entity cache if it is enabled.
	 *
	 * @param personas the personas
	 */
	@Override
	public void cacheResult(Personas personas) {
		entityCache.putResult(
			entityCacheEnabled, PersonasImpl.class, personas.getPrimaryKey(),
			personas);

		personas.resetOriginalValues();
	}

	/**
	 * Caches the personases in the entity cache if it is enabled.
	 *
	 * @param personases the personases
	 */
	@Override
	public void cacheResult(List<Personas> personases) {
		for (Personas personas : personases) {
			if (entityCache.getResult(
					entityCacheEnabled, PersonasImpl.class,
					personas.getPrimaryKey()) == null) {

				cacheResult(personas);
			}
			else {
				personas.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all personases.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PersonasImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the personas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Personas personas) {
		entityCache.removeResult(
			entityCacheEnabled, PersonasImpl.class, personas.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Personas> personases) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Personas personas : personases) {
			entityCache.removeResult(
				entityCacheEnabled, PersonasImpl.class,
				personas.getPrimaryKey());
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, PersonasImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new personas with the primary key. Does not add the personas to the database.
	 *
	 * @param dni the primary key for the new personas
	 * @return the new personas
	 */
	@Override
	public Personas create(String dni) {
		Personas personas = new PersonasImpl();

		personas.setNew(true);
		personas.setPrimaryKey(dni);

		String uuid = PortalUUIDUtil.generate();

		personas.setUuid(uuid);

		return personas;
	}

	/**
	 * Removes the personas with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas that was removed
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	@Override
	public Personas remove(String dni) throws NoSuchPersonasException {
		return remove((Serializable)dni);
	}

	/**
	 * Removes the personas with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the personas
	 * @return the personas that was removed
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	@Override
	public Personas remove(Serializable primaryKey)
		throws NoSuchPersonasException {

		Session session = null;

		try {
			session = openSession();

			Personas personas = (Personas)session.get(
				PersonasImpl.class, primaryKey);

			if (personas == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPersonasException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(personas);
		}
		catch (NoSuchPersonasException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Personas removeImpl(Personas personas) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(personas)) {
				personas = (Personas)session.get(
					PersonasImpl.class, personas.getPrimaryKeyObj());
			}

			if (personas != null) {
				session.delete(personas);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (personas != null) {
			clearCache(personas);
		}

		return personas;
	}

	@Override
	public Personas updateImpl(Personas personas) {
		boolean isNew = personas.isNew();

		if (!(personas instanceof PersonasModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(personas.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(personas);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in personas proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Personas implementation " +
					personas.getClass());
		}

		PersonasModelImpl personasModelImpl = (PersonasModelImpl)personas;

		if (Validator.isNull(personas.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			personas.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (personas.isNew()) {
				session.save(personas);

				personas.setNew(false);
			}
			else {
				personas = (Personas)session.merge(personas);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {personasModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {personasModelImpl.getNacimiento()};

			finderCache.removeResult(_finderPathCountByNacimiento, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByNacimiento, args);

			args = new Object[] {personasModelImpl.getSexo()};

			finderCache.removeResult(_finderPathCountBySexo, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBySexo, args);

			args = new Object[] {personasModelImpl.isTrabaja()};

			finderCache.removeResult(_finderPathCountByTrabaja, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByTrabaja, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((personasModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					personasModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {personasModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((personasModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByNacimiento.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					personasModelImpl.getOriginalNacimiento()
				};

				finderCache.removeResult(_finderPathCountByNacimiento, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByNacimiento, args);

				args = new Object[] {personasModelImpl.getNacimiento()};

				finderCache.removeResult(_finderPathCountByNacimiento, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByNacimiento, args);
			}

			if ((personasModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBySexo.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					personasModelImpl.getOriginalSexo()
				};

				finderCache.removeResult(_finderPathCountBySexo, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBySexo, args);

				args = new Object[] {personasModelImpl.getSexo()};

				finderCache.removeResult(_finderPathCountBySexo, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBySexo, args);
			}

			if ((personasModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByTrabaja.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					personasModelImpl.getOriginalTrabaja()
				};

				finderCache.removeResult(_finderPathCountByTrabaja, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByTrabaja, args);

				args = new Object[] {personasModelImpl.isTrabaja()};

				finderCache.removeResult(_finderPathCountByTrabaja, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByTrabaja, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, PersonasImpl.class, personas.getPrimaryKey(),
			personas, false);

		personas.resetOriginalValues();

		return personas;
	}

	/**
	 * Returns the personas with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the personas
	 * @return the personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	@Override
	public Personas findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPersonasException {

		Personas personas = fetchByPrimaryKey(primaryKey);

		if (personas == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPersonasException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return personas;
	}

	/**
	 * Returns the personas with the primary key or throws a <code>NoSuchPersonasException</code> if it could not be found.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas
	 * @throws NoSuchPersonasException if a personas with the primary key could not be found
	 */
	@Override
	public Personas findByPrimaryKey(String dni)
		throws NoSuchPersonasException {

		return findByPrimaryKey((Serializable)dni);
	}

	/**
	 * Returns the personas with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dni the primary key of the personas
	 * @return the personas, or <code>null</code> if a personas with the primary key could not be found
	 */
	@Override
	public Personas fetchByPrimaryKey(String dni) {
		return fetchByPrimaryKey((Serializable)dni);
	}

	/**
	 * Returns all the personases.
	 *
	 * @return the personases
	 */
	@Override
	public List<Personas> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Personas> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Personas> findAll(
		int start, int end, OrderByComparator<Personas> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Personas> findAll(
		int start, int end, OrderByComparator<Personas> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Personas> list = null;

		if (useFinderCache) {
			list = (List<Personas>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PERSONAS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PERSONAS;

				sql = sql.concat(PersonasModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Personas>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the personases from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Personas personas : findAll()) {
			remove(personas);
		}
	}

	/**
	 * Returns the number of personases.
	 *
	 * @return the number of personases
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PERSONAS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "dni";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PERSONAS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PersonasModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the personas persistence.
	 */
	@Activate
	public void activate() {
		PersonasModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		PersonasModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PersonasImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PersonasImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PersonasImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PersonasImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			PersonasModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByNacimiento = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PersonasImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNacimiento",
			new String[] {
				Date.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByNacimiento = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PersonasImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNacimiento",
			new String[] {Date.class.getName()},
			PersonasModelImpl.NACIMIENTO_COLUMN_BITMASK);

		_finderPathCountByNacimiento = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNacimiento",
			new String[] {Date.class.getName()});

		_finderPathWithPaginationFindBySexo = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PersonasImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySexo",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBySexo = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PersonasImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySexo",
			new String[] {String.class.getName()},
			PersonasModelImpl.SEXO_COLUMN_BITMASK);

		_finderPathCountBySexo = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySexo",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByTrabaja = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PersonasImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTrabaja",
			new String[] {
				Boolean.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByTrabaja = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PersonasImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTrabaja",
			new String[] {Boolean.class.getName()},
			PersonasModelImpl.TRABAJA_COLUMN_BITMASK);

		_finderPathCountByTrabaja = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTrabaja",
			new String[] {Boolean.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(PersonasImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = PersonasPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.liferay.training.personas.model.Personas"),
			true);
	}

	@Override
	@Reference(
		target = PersonasPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PersonasPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private Long _getTime(Date date) {
		if (date == null) {
			return null;
		}

		return date.getTime();
	}

	private static final String _SQL_SELECT_PERSONAS =
		"SELECT personas FROM Personas personas";

	private static final String _SQL_SELECT_PERSONAS_WHERE =
		"SELECT personas FROM Personas personas WHERE ";

	private static final String _SQL_COUNT_PERSONAS =
		"SELECT COUNT(personas) FROM Personas personas";

	private static final String _SQL_COUNT_PERSONAS_WHERE =
		"SELECT COUNT(personas) FROM Personas personas WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "personas.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Personas exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Personas exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PersonasPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	static {
		try {
			Class.forName(PersonasPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}