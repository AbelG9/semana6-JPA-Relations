CREATE DATABASE "relaJPA"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Peru.1252'
    LC_CTYPE = 'Spanish_Peru.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

CREATE TABLE categoria (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
	estado INT
);

CREATE TABLE autor (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
	estado INT
);

CREATE TABLE editor (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
	estado INT
);

CREATE TABLE libro (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(255),
    editor_id INT,
	autor_id INT,
	estado INT,
    FOREIGN KEY (editor_id) REFERENCES editor(id),
	FOREIGN KEY (autor_id) REFERENCES autor(id)
);

CREATE TABLE libro_categoria (
    libro_id INT,
    categoria_id INT,
    PRIMARY KEY (libro_id, categoria_id),
    FOREIGN KEY (libro_id) REFERENCES libro(id),
    FOREIGN KEY (categoria_id) REFERENCES categoria(id)
);
