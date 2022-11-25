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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Personas}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Personas
 * @generated
 */
public class PersonasWrapper
	extends BaseModelWrapper<Personas>
	implements ModelWrapper<Personas>, Personas {

	public PersonasWrapper(Personas personas) {
		super(personas);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dni", getDni());
		attributes.put("nombre", getNombre());
		attributes.put("apellido1", getApellido1());
		attributes.put("apellido2", getApellido2());
		attributes.put("nacimiento", getNacimiento());
		attributes.put("sexo", getSexo());
		attributes.put("altura", getAltura());
		attributes.put("trabaja", isTrabaja());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String dni = (String)attributes.get("dni");

		if (dni != null) {
			setDni(dni);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String apellido1 = (String)attributes.get("apellido1");

		if (apellido1 != null) {
			setApellido1(apellido1);
		}

		String apellido2 = (String)attributes.get("apellido2");

		if (apellido2 != null) {
			setApellido2(apellido2);
		}

		Date nacimiento = (Date)attributes.get("nacimiento");

		if (nacimiento != null) {
			setNacimiento(nacimiento);
		}

		String sexo = (String)attributes.get("sexo");

		if (sexo != null) {
			setSexo(sexo);
		}

		Double altura = (Double)attributes.get("altura");

		if (altura != null) {
			setAltura(altura);
		}

		Boolean trabaja = (Boolean)attributes.get("trabaja");

		if (trabaja != null) {
			setTrabaja(trabaja);
		}
	}

	/**
	 * Returns the altura of this personas.
	 *
	 * @return the altura of this personas
	 */
	@Override
	public double getAltura() {
		return model.getAltura();
	}

	/**
	 * Returns the apellido1 of this personas.
	 *
	 * @return the apellido1 of this personas
	 */
	@Override
	public String getApellido1() {
		return model.getApellido1();
	}

	/**
	 * Returns the apellido2 of this personas.
	 *
	 * @return the apellido2 of this personas
	 */
	@Override
	public String getApellido2() {
		return model.getApellido2();
	}

	/**
	 * Returns the dni of this personas.
	 *
	 * @return the dni of this personas
	 */
	@Override
	public String getDni() {
		return model.getDni();
	}

	/**
	 * Returns the nacimiento of this personas.
	 *
	 * @return the nacimiento of this personas
	 */
	@Override
	public Date getNacimiento() {
		return model.getNacimiento();
	}

	/**
	 * Returns the nombre of this personas.
	 *
	 * @return the nombre of this personas
	 */
	@Override
	public String getNombre() {
		return model.getNombre();
	}

	/**
	 * Returns the primary key of this personas.
	 *
	 * @return the primary key of this personas
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sexo of this personas.
	 *
	 * @return the sexo of this personas
	 */
	@Override
	public String getSexo() {
		return model.getSexo();
	}

	/**
	 * Returns the trabaja of this personas.
	 *
	 * @return the trabaja of this personas
	 */
	@Override
	public boolean getTrabaja() {
		return model.getTrabaja();
	}

	/**
	 * Returns the uuid of this personas.
	 *
	 * @return the uuid of this personas
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this personas is trabaja.
	 *
	 * @return <code>true</code> if this personas is trabaja; <code>false</code> otherwise
	 */
	@Override
	public boolean isTrabaja() {
		return model.isTrabaja();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the altura of this personas.
	 *
	 * @param altura the altura of this personas
	 */
	@Override
	public void setAltura(double altura) {
		model.setAltura(altura);
	}

	/**
	 * Sets the apellido1 of this personas.
	 *
	 * @param apellido1 the apellido1 of this personas
	 */
	@Override
	public void setApellido1(String apellido1) {
		model.setApellido1(apellido1);
	}

	/**
	 * Sets the apellido2 of this personas.
	 *
	 * @param apellido2 the apellido2 of this personas
	 */
	@Override
	public void setApellido2(String apellido2) {
		model.setApellido2(apellido2);
	}

	/**
	 * Sets the dni of this personas.
	 *
	 * @param dni the dni of this personas
	 */
	@Override
	public void setDni(String dni) {
		model.setDni(dni);
	}

	/**
	 * Sets the nacimiento of this personas.
	 *
	 * @param nacimiento the nacimiento of this personas
	 */
	@Override
	public void setNacimiento(Date nacimiento) {
		model.setNacimiento(nacimiento);
	}

	/**
	 * Sets the nombre of this personas.
	 *
	 * @param nombre the nombre of this personas
	 */
	@Override
	public void setNombre(String nombre) {
		model.setNombre(nombre);
	}

	/**
	 * Sets the primary key of this personas.
	 *
	 * @param primaryKey the primary key of this personas
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sexo of this personas.
	 *
	 * @param sexo the sexo of this personas
	 */
	@Override
	public void setSexo(String sexo) {
		model.setSexo(sexo);
	}

	/**
	 * Sets whether this personas is trabaja.
	 *
	 * @param trabaja the trabaja of this personas
	 */
	@Override
	public void setTrabaja(boolean trabaja) {
		model.setTrabaja(trabaja);
	}

	/**
	 * Sets the uuid of this personas.
	 *
	 * @param uuid the uuid of this personas
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected PersonasWrapper wrap(Personas personas) {
		return new PersonasWrapper(personas);
	}

}