-- Crea,os la Base de Datos
CREATE DATABASE EC1_QUISPE;

-- Usamos la Base de Datos
USE EC1_QUISPE;

-- Creamos las tablas
CREATE TABLE areas(
	id_area INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nom_area VARCHAR(50)  NOT NULL,
    cant_clien_area INT NOT NULL
);

CREATE TABLE clientes(
	id_cliente INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nom_cliente VARCHAR(100) NOT NULL,
    id_area INT NOT NULL,
    numero_cliente VARCHAR(9) NOT NULL,
    edad_cliente INT NOT NULL,
	correo_cliente VARCHAR(100) NOT NULL,
    FOREIGN KEY (id_area) REFERENCES areas(id_area)
);

-- Insertamos informacion de Ejemplo en la tabla de Areas
INSERT INTO areas (id_area, nom_area, cant_clien_area) VALUES(NULL, "Mantenimiento", 20);
INSERT INTO areas (id_area, nom_area, cant_clien_area) VALUES(NULL, "Gestion", 5);
INSERT INTO areas (id_area, nom_area, cant_clien_area) VALUES(NULL, "Limpieza", 30);

-- Revisamos si quedaron grabados en la Base de Datos
SELECT * FROM areas; 

-- Insertamos informacion de Ejemplo en la tabla de Clientes
INSERT INTO clientes (id_cliente, nom_cliente, id_area, numero_cliente, edad_cliente, correo_cliente) VALUES
(NULL, "Raul", 3, "12345678", 25, "raul123@gmail.com"),
(NULL, "Cristobal", 1, "98765432", 24, "cristo123@gmail.com"),
(NULL, "David", 2, "45678912", 21, "david123@gmail.com");

-- Revisamos si quedaron grabados en la Base de Datos
SELECT * FROM clientes;