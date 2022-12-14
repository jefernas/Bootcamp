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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Personas service. Represents a row in the &quot;Personas_Personas&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.training.personas.model.impl.PersonasModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.training.personas.model.impl.PersonasImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Personas
 * @generated
 */
@ProviderType
public interface PersonasModel extends BaseModel<Personas> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a personas model instance should use the {@link Personas} interface instead.
	 */

	/**
	 * Returns the primary key of this personas.
	 *
	 * @return the primary key of this personas
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this personas.
	 *
	 * @param primaryKey the primary key of this personas
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the uuid of this personas.
	 *
	 * @return the uuid of this personas
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this personas.
	 *
	 * @param uuid the uuid of this personas
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the dni of this personas.
	 *
	 * @return the dni of this personas
	 */
	@AutoEscape
	public String getDni();

	/**
	 * Sets the dni of this personas.
	 *
	 * @param dni the dni of this personas
	 */
	public void setDni(String dni);

	/**
	 * Returns the nombre of this personas.
	 *
	 * @return the nombre of this personas
	 */
	@AutoEscape
	public String getNombre();

	/**
	 * Sets the nombre of this personas.
	 *
	 * @param nombre the nombre of this personas
	 */
	public void setNombre(String nombre);

	/**
	 * Returns the apellido1 of this personas.
	 *
	 * @return the apellido1 of this personas
	 */
	@AutoEscape
	public String getApellido1();

	/**
	 * Sets the apellido1 of this personas.
	 *
	 * @param apellido1 the apellido1 of this personas
	 */
	public void setApellido1(String apellido1);

	/**
	 * Returns the apellido2 of this personas.
	 *
	 * @return the apellido2 of this personas
	 */
	@AutoEscape
	public String getApellido2();

	/**
	 * Sets the apellido2 of this personas.
	 *
	 * @param apellido2 the apellido2 of this personas
	 */
	public void setApellido2(String apellido2);

	/**
	 * Returns the nacimiento of this personas.
	 *
	 * @return the nacimiento of this personas
	 */
	public Date getNacimiento();

	/**
	 * Sets the nacimiento of this personas.
	 *
	 * @param nacimiento the nacimiento of this personas
	 */
	public void setNacimiento(Date nacimiento);

	/**
	 * Returns the sexo of this personas.
	 *
	 * @return the sexo of this personas
	 */
	@AutoEscape
	public String getSexo();

	/**
	 * Sets the sexo of this personas.
	 *
	 * @param sexo the sexo of this personas
	 */
	public void setSexo(String sexo);

	/**
	 * Returns the altura of this personas.
	 *
	 * @return the altura of this personas
	 */
	public double getAltura();

	/**
	 * Sets the altura of this personas.
	 *
	 * @param altura the altura of this personas
	 */
	public void setAltura(double altura);

	/**
	 * Returns the trabaja of this personas.
	 *
	 * @return the trabaja of this personas
	 */
	public boolean getTrabaja();

	/**
	 * Returns <code>true</code> if this personas is trabaja.
	 *
	 * @return <code>true</code> if this personas is trabaja; <code>false</code> otherwise
	 */
	public boolean isTrabaja();

	/**
	 * Sets whether this personas is trabaja.
	 *
	 * @param trabaja the trabaja of this personas
	 */
	public void setTrabaja(boolean trabaja);

}