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

package com.liferay.training.personas.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.personas.model.Personas;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Personas in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PersonasCacheModel
	implements CacheModel<Personas>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PersonasCacheModel)) {
			return false;
		}

		PersonasCacheModel personasCacheModel = (PersonasCacheModel)obj;

		if (dni.equals(personasCacheModel.dni)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dni);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dni=");
		sb.append(dni);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", apellido1=");
		sb.append(apellido1);
		sb.append(", apellido2=");
		sb.append(apellido2);
		sb.append(", nacimiento=");
		sb.append(nacimiento);
		sb.append(", sexo=");
		sb.append(sexo);
		sb.append(", altura=");
		sb.append(altura);
		sb.append(", trabaja=");
		sb.append(trabaja);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Personas toEntityModel() {
		PersonasImpl personasImpl = new PersonasImpl();

		if (uuid == null) {
			personasImpl.setUuid("");
		}
		else {
			personasImpl.setUuid(uuid);
		}

		if (dni == null) {
			personasImpl.setDni("");
		}
		else {
			personasImpl.setDni(dni);
		}

		if (nombre == null) {
			personasImpl.setNombre("");
		}
		else {
			personasImpl.setNombre(nombre);
		}

		if (apellido1 == null) {
			personasImpl.setApellido1("");
		}
		else {
			personasImpl.setApellido1(apellido1);
		}

		if (apellido2 == null) {
			personasImpl.setApellido2("");
		}
		else {
			personasImpl.setApellido2(apellido2);
		}

		if (nacimiento == Long.MIN_VALUE) {
			personasImpl.setNacimiento(null);
		}
		else {
			personasImpl.setNacimiento(new Date(nacimiento));
		}

		if (sexo == null) {
			personasImpl.setSexo("");
		}
		else {
			personasImpl.setSexo(sexo);
		}

		personasImpl.setAltura(altura);
		personasImpl.setTrabaja(trabaja);

		personasImpl.resetOriginalValues();

		return personasImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		dni = objectInput.readUTF();
		nombre = objectInput.readUTF();
		apellido1 = objectInput.readUTF();
		apellido2 = objectInput.readUTF();
		nacimiento = objectInput.readLong();
		sexo = objectInput.readUTF();

		altura = objectInput.readDouble();

		trabaja = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		if (dni == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dni);
		}

		if (nombre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (apellido1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(apellido1);
		}

		if (apellido2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(apellido2);
		}

		objectOutput.writeLong(nacimiento);

		if (sexo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sexo);
		}

		objectOutput.writeDouble(altura);

		objectOutput.writeBoolean(trabaja);
	}

	public String uuid;
	public String dni;
	public String nombre;
	public String apellido1;
	public String apellido2;
	public long nacimiento;
	public String sexo;
	public double altura;
	public boolean trabaja;

}