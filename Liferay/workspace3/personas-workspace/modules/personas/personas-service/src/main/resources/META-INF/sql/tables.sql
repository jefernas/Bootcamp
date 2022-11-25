create table Personas_Personas (
	uuid_ VARCHAR(75) null,
	dni VARCHAR(75) not null primary key,
	nombre VARCHAR(75) null,
	apellido1 VARCHAR(75) null,
	apellido2 VARCHAR(75) null,
	nacimiento DATE null,
	sexo VARCHAR(75) null,
	altura DOUBLE,
	trabaja BOOLEAN
);