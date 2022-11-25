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

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.training.personas.model.Personas;
import com.liferay.training.personas.model.PersonasModel;
import com.liferay.training.personas.model.PersonasSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Personas service. Represents a row in the &quot;Personas_Personas&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PersonasModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PersonasImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonasImpl
 * @generated
 */
@JSON(strict = true)
public class PersonasModelImpl
	extends BaseModelImpl<Personas> implements PersonasModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a personas model instance should use the <code>Personas</code> interface instead.
	 */
	public static final String TABLE_NAME = "Personas_Personas";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"dni", Types.VARCHAR},
		{"nombre", Types.VARCHAR}, {"apellido1", Types.VARCHAR},
		{"apellido2", Types.VARCHAR}, {"nacimiento", Types.TIMESTAMP},
		{"sexo", Types.VARCHAR}, {"altura", Types.DOUBLE},
		{"trabaja", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dni", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nombre", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("apellido1", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("apellido2", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nacimiento", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("sexo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("altura", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("trabaja", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Personas_Personas (uuid_ VARCHAR(75) null,dni VARCHAR(75) not null primary key,nombre VARCHAR(75) null,apellido1 VARCHAR(75) null,apellido2 VARCHAR(75) null,nacimiento DATE null,sexo VARCHAR(75) null,altura DOUBLE,trabaja BOOLEAN)";

	public static final String TABLE_SQL_DROP = "drop table Personas_Personas";

	public static final String ORDER_BY_JPQL = " ORDER BY personas.dni ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Personas_Personas.dni ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long NACIMIENTO_COLUMN_BITMASK = 1L;

	public static final long SEXO_COLUMN_BITMASK = 2L;

	public static final long TRABAJA_COLUMN_BITMASK = 4L;

	public static final long UUID_COLUMN_BITMASK = 8L;

	public static final long DNI_COLUMN_BITMASK = 16L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Personas toModel(PersonasSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Personas model = new PersonasImpl();

		model.setUuid(soapModel.getUuid());
		model.setDni(soapModel.getDni());
		model.setNombre(soapModel.getNombre());
		model.setApellido1(soapModel.getApellido1());
		model.setApellido2(soapModel.getApellido2());
		model.setNacimiento(soapModel.getNacimiento());
		model.setSexo(soapModel.getSexo());
		model.setAltura(soapModel.getAltura());
		model.setTrabaja(soapModel.isTrabaja());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Personas> toModels(PersonasSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Personas> models = new ArrayList<Personas>(soapModels.length);

		for (PersonasSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public PersonasModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _dni;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setDni(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dni;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return Personas.class;
	}

	@Override
	public String getModelClassName() {
		return Personas.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Personas, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Personas, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Personas, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Personas)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Personas, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Personas, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Personas)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Personas, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Personas, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Personas>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Personas.class.getClassLoader(), Personas.class,
			ModelWrapper.class);

		try {
			Constructor<Personas> constructor =
				(Constructor<Personas>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Personas, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Personas, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Personas, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Personas, Object>>();
		Map<String, BiConsumer<Personas, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Personas, ?>>();

		attributeGetterFunctions.put("uuid", Personas::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Personas, String>)Personas::setUuid);
		attributeGetterFunctions.put("dni", Personas::getDni);
		attributeSetterBiConsumers.put(
			"dni", (BiConsumer<Personas, String>)Personas::setDni);
		attributeGetterFunctions.put("nombre", Personas::getNombre);
		attributeSetterBiConsumers.put(
			"nombre", (BiConsumer<Personas, String>)Personas::setNombre);
		attributeGetterFunctions.put("apellido1", Personas::getApellido1);
		attributeSetterBiConsumers.put(
			"apellido1", (BiConsumer<Personas, String>)Personas::setApellido1);
		attributeGetterFunctions.put("apellido2", Personas::getApellido2);
		attributeSetterBiConsumers.put(
			"apellido2", (BiConsumer<Personas, String>)Personas::setApellido2);
		attributeGetterFunctions.put("nacimiento", Personas::getNacimiento);
		attributeSetterBiConsumers.put(
			"nacimiento", (BiConsumer<Personas, Date>)Personas::setNacimiento);
		attributeGetterFunctions.put("sexo", Personas::getSexo);
		attributeSetterBiConsumers.put(
			"sexo", (BiConsumer<Personas, String>)Personas::setSexo);
		attributeGetterFunctions.put("altura", Personas::getAltura);
		attributeSetterBiConsumers.put(
			"altura", (BiConsumer<Personas, Double>)Personas::setAltura);
		attributeGetterFunctions.put("trabaja", Personas::getTrabaja);
		attributeSetterBiConsumers.put(
			"trabaja", (BiConsumer<Personas, Boolean>)Personas::setTrabaja);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public String getDni() {
		if (_dni == null) {
			return "";
		}
		else {
			return _dni;
		}
	}

	@Override
	public void setDni(String dni) {
		_dni = dni;
	}

	@JSON
	@Override
	public String getNombre() {
		if (_nombre == null) {
			return "";
		}
		else {
			return _nombre;
		}
	}

	@Override
	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	@JSON
	@Override
	public String getApellido1() {
		if (_apellido1 == null) {
			return "";
		}
		else {
			return _apellido1;
		}
	}

	@Override
	public void setApellido1(String apellido1) {
		_apellido1 = apellido1;
	}

	@JSON
	@Override
	public String getApellido2() {
		if (_apellido2 == null) {
			return "";
		}
		else {
			return _apellido2;
		}
	}

	@Override
	public void setApellido2(String apellido2) {
		_apellido2 = apellido2;
	}

	@JSON
	@Override
	public Date getNacimiento() {
		return _nacimiento;
	}

	@Override
	public void setNacimiento(Date nacimiento) {
		_columnBitmask |= NACIMIENTO_COLUMN_BITMASK;

		if (_originalNacimiento == null) {
			_originalNacimiento = _nacimiento;
		}

		_nacimiento = nacimiento;
	}

	public Date getOriginalNacimiento() {
		return _originalNacimiento;
	}

	@JSON
	@Override
	public String getSexo() {
		if (_sexo == null) {
			return "";
		}
		else {
			return _sexo;
		}
	}

	@Override
	public void setSexo(String sexo) {
		_columnBitmask |= SEXO_COLUMN_BITMASK;

		if (_originalSexo == null) {
			_originalSexo = _sexo;
		}

		_sexo = sexo;
	}

	public String getOriginalSexo() {
		return GetterUtil.getString(_originalSexo);
	}

	@JSON
	@Override
	public double getAltura() {
		return _altura;
	}

	@Override
	public void setAltura(double altura) {
		_altura = altura;
	}

	@JSON
	@Override
	public boolean getTrabaja() {
		return _trabaja;
	}

	@JSON
	@Override
	public boolean isTrabaja() {
		return _trabaja;
	}

	@Override
	public void setTrabaja(boolean trabaja) {
		_columnBitmask |= TRABAJA_COLUMN_BITMASK;

		if (!_setOriginalTrabaja) {
			_setOriginalTrabaja = true;

			_originalTrabaja = _trabaja;
		}

		_trabaja = trabaja;
	}

	public boolean getOriginalTrabaja() {
		return _originalTrabaja;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public Personas toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Personas>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PersonasImpl personasImpl = new PersonasImpl();

		personasImpl.setUuid(getUuid());
		personasImpl.setDni(getDni());
		personasImpl.setNombre(getNombre());
		personasImpl.setApellido1(getApellido1());
		personasImpl.setApellido2(getApellido2());
		personasImpl.setNacimiento(getNacimiento());
		personasImpl.setSexo(getSexo());
		personasImpl.setAltura(getAltura());
		personasImpl.setTrabaja(isTrabaja());

		personasImpl.resetOriginalValues();

		return personasImpl;
	}

	@Override
	public int compareTo(Personas personas) {
		String primaryKey = personas.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Personas)) {
			return false;
		}

		Personas personas = (Personas)obj;

		String primaryKey = personas.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		PersonasModelImpl personasModelImpl = this;

		personasModelImpl._originalUuid = personasModelImpl._uuid;

		personasModelImpl._originalNacimiento = personasModelImpl._nacimiento;

		personasModelImpl._originalSexo = personasModelImpl._sexo;

		personasModelImpl._originalTrabaja = personasModelImpl._trabaja;

		personasModelImpl._setOriginalTrabaja = false;

		personasModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Personas> toCacheModel() {
		PersonasCacheModel personasCacheModel = new PersonasCacheModel();

		personasCacheModel.uuid = getUuid();

		String uuid = personasCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			personasCacheModel.uuid = null;
		}

		personasCacheModel.dni = getDni();

		String dni = personasCacheModel.dni;

		if ((dni != null) && (dni.length() == 0)) {
			personasCacheModel.dni = null;
		}

		personasCacheModel.nombre = getNombre();

		String nombre = personasCacheModel.nombre;

		if ((nombre != null) && (nombre.length() == 0)) {
			personasCacheModel.nombre = null;
		}

		personasCacheModel.apellido1 = getApellido1();

		String apellido1 = personasCacheModel.apellido1;

		if ((apellido1 != null) && (apellido1.length() == 0)) {
			personasCacheModel.apellido1 = null;
		}

		personasCacheModel.apellido2 = getApellido2();

		String apellido2 = personasCacheModel.apellido2;

		if ((apellido2 != null) && (apellido2.length() == 0)) {
			personasCacheModel.apellido2 = null;
		}

		Date nacimiento = getNacimiento();

		if (nacimiento != null) {
			personasCacheModel.nacimiento = nacimiento.getTime();
		}
		else {
			personasCacheModel.nacimiento = Long.MIN_VALUE;
		}

		personasCacheModel.sexo = getSexo();

		String sexo = personasCacheModel.sexo;

		if ((sexo != null) && (sexo.length() == 0)) {
			personasCacheModel.sexo = null;
		}

		personasCacheModel.altura = getAltura();

		personasCacheModel.trabaja = isTrabaja();

		return personasCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Personas, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Personas, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Personas, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Personas)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Personas, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Personas, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Personas, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Personas)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Personas>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private String _dni;
	private String _nombre;
	private String _apellido1;
	private String _apellido2;
	private Date _nacimiento;
	private Date _originalNacimiento;
	private String _sexo;
	private String _originalSexo;
	private double _altura;
	private boolean _trabaja;
	private boolean _originalTrabaja;
	private boolean _setOriginalTrabaja;
	private long _columnBitmask;
	private Personas _escapedModel;

}