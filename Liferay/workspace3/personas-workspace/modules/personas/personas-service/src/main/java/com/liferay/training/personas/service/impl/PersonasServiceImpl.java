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

package com.liferay.training.personas.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.personas.model.Personas;
import com.liferay.training.personas.service.base.PersonasServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the personas remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.personas.service.PersonasService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonasServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=personas",
		"json.web.service.context.path=Personas"
	},
	service = AopService.class
)
public class PersonasServiceImpl extends PersonasServiceBaseImpl {

	/*
	@Override
	public Personas addPersonas(String dni, String nombre, String apellido1, String apellido2, Date nacimiento,
			String sexo, double altura, boolean trabaja) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countByNacimiento(Date nacimiento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySexo(String sexo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countByTrabaja(boolean trabaja) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Personas deletePersonas(String dni) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personas> findByNacimiento(Date nacimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personas> findByNacimiento(Date nacimiento, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personas> findBySexo(String sexo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personas> findBySexo(String sexo, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personas> findByTrabaja(boolean trabaja) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personas> findByTrabaja(boolean trabaja, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personas updatePersonas(String dni, String nombre, String apellido1, String apellido2, Date nacimiento,
			String sexo, double altura, boolean trabaja) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}*/

	//CREATE
	@Override
	public Personas addPersonas(String dni, String nombre, String apellido1, String apellido2, Date nacimiento, String sexo, double altura, boolean trabaja) throws PortalException{
		return personasLocalService.addPersonas(dni, nombre, apellido1, apellido2, nacimiento, sexo, altura, trabaja);
		//return ((PersonasServiceImpl) personasService).addPersonas(dni, nombre, apellido1, apellido2, nacimiento, sexo, altura, trabaja);
	}
	
	//READ
	@Override
	public List<Personas> findByNacimiento(Date nacimiento){
		//return ((PersonasServiceImpl) personasService).findByNacimiento(nacimiento);
		return personasLocalService.findByNacimiento(nacimiento);
	}
	@Override
	public List<Personas> findByNacimiento(Date nacimiento,int start, int end){
		//return ((PersonasServiceImpl) personasService).findByNacimiento(nacimiento, start, end);
		return personasLocalService.findByNacimiento(nacimiento, start, end);
	}
	@Override
	public int countByNacimiento(Date nacimiento) {
		//return ((PersonasServiceImpl) personasService).countByNacimiento(nacimiento);
		return personasLocalService.countByNacimiento(nacimiento);
	}
	@Override
	public List<Personas> findBySexo(String sexo){
		//return ((PersonasServiceImpl) personasLocalService).findBySexo(sexo);
		return personasLocalService.findBySexo(sexo);
	}
	@Override
	public List<Personas> findBySexo(String sexo,int start, int end){
		//return ((PersonasServiceImpl) personasLocalService).findBySexo(sexo, start, end);
		return personasLocalService.findBySexo(sexo, start, end);
	}
	@Override
	public int countBySexo(String sexo) {
		//return ((PersonasServiceImpl) personasLocalService).countBySexo(sexo);
		return personasLocalService.countBySexo(sexo);
	}
	@Override
	public List<Personas> findByTrabaja(boolean trabaja){
		//return ((PersonasServiceImpl) personasLocalService).findByTrabaja(trabaja);
		return personasLocalService.findByTrabaja(trabaja);
	}
	@Override
	public List<Personas> findByTrabaja(boolean trabaja,int start, int end){
		//return ((PersonasServiceImpl) personasLocalService).findByTrabaja(trabaja, start, end);
		return personasLocalService.findByTrabaja(trabaja, start, end);
	}
	@Override
	public int countByTrabaja(boolean trabaja) {
		//return ((PersonasServiceImpl) personasLocalService).countByTrabaja(trabaja);
		return personasLocalService.countByTrabaja(trabaja);
	}
	
	//UPDATE
	@Override
	public Personas updatePersonas(String dni, String nombre, String apellido1, String apellido2, Date nacimiento, String sexo, double altura, boolean trabaja) throws PortalException{
		//return ((PersonasServiceImpl) personasLocalService).updatePersonas(dni, nombre, apellido1, apellido2, nacimiento, sexo, altura, trabaja);
		return personasLocalService.updatePersonas(dni, nombre, apellido1, apellido2, nacimiento, sexo, altura, trabaja);
	}
	
	//DELETE
	@Override
	public Personas deletePersonas(String dni) throws PortalException{
		//return personasLocalService.deletePersonas(dni);
		return personasLocalService.deletePersonas(dni);
	}
}