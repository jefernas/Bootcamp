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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.personas.model.Personas;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Personas. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PersonasServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface PersonasService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PersonasServiceUtil} to access the personas remote service. Add custom service methods to <code>com.liferay.training.personas.service.impl.PersonasServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Personas addPersonas(
			String dni, String nombre, String apellido1, String apellido2,
			Date nacimiento, String sexo, double altura, boolean trabaja)
		throws PortalException;

	public int countByNacimiento(Date nacimiento);

	public int countBySexo(String sexo);

	public int countByTrabaja(boolean trabaja);

	public Personas deletePersonas(String dni) throws PortalException;

	public List<Personas> findByNacimiento(Date nacimiento);

	public List<Personas> findByNacimiento(Date nacimiento, int start, int end);

	public List<Personas> findBySexo(String sexo);

	public List<Personas> findBySexo(String sexo, int start, int end);

	public List<Personas> findByTrabaja(boolean trabaja);

	public List<Personas> findByTrabaja(boolean trabaja, int start, int end);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public Personas updatePersonas(
			String dni, String nombre, String apellido1, String apellido2,
			Date nacimiento, String sexo, double altura, boolean trabaja)
		throws PortalException;



}