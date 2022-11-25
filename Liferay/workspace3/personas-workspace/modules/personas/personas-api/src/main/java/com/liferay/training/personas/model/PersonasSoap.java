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

package com.liferay.training.personas.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.training.personas.service.http.PersonasServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PersonasSoap implements Serializable {

	public static PersonasSoap toSoapModel(Personas model) {
		PersonasSoap soapModel = new PersonasSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDni(model.getDni());
		soapModel.setNombre(model.getNombre());
		soapModel.setApellido1(model.getApellido1());
		soapModel.setApellido2(model.getApellido2());
		soapModel.setNacimiento(model.getNacimiento());
		soapModel.setSexo(model.getSexo());
		soapModel.setAltura(model.getAltura());
		soapModel.setTrabaja(model.isTrabaja());

		return soapModel;
	}

	public static PersonasSoap[] toSoapModels(Personas[] models) {
		PersonasSoap[] soapModels = new PersonasSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PersonasSoap[][] toSoapModels(Personas[][] models) {
		PersonasSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PersonasSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PersonasSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PersonasSoap[] toSoapModels(List<Personas> models) {
		List<PersonasSoap> soapModels = new ArrayList<PersonasSoap>(
			models.size());

		for (Personas model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PersonasSoap[soapModels.size()]);
	}

	public PersonasSoap() {
	}

	public String getPrimaryKey() {
		return _dni;
	}

	public void setPrimaryKey(String pk) {
		setDni(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getDni() {
		return _dni;
	}

	public void setDni(String dni) {
		_dni = dni;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getApellido1() {
		return _apellido1;
	}

	public void setApellido1(String apellido1) {
		_apellido1 = apellido1;
	}

	public String getApellido2() {
		return _apellido2;
	}

	public void setApellido2(String apellido2) {
		_apellido2 = apellido2;
	}

	public Date getNacimiento() {
		return _nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		_nacimiento = nacimiento;
	}

	public String getSexo() {
		return _sexo;
	}

	public void setSexo(String sexo) {
		_sexo = sexo;
	}

	public double getAltura() {
		return _altura;
	}

	public void setAltura(double altura) {
		_altura = altura;
	}

	public boolean getTrabaja() {
		return _trabaja;
	}

	public boolean isTrabaja() {
		return _trabaja;
	}

	public void setTrabaja(boolean trabaja) {
		_trabaja = trabaja;
	}

	private String _uuid;
	private String _dni;
	private String _nombre;
	private String _apellido1;
	private String _apellido2;
	private Date _nacimiento;
	private String _sexo;
	private double _altura;
	private boolean _trabaja;

}