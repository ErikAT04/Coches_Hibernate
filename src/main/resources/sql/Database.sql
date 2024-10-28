DROP DATABASE IF EXISTS coches_erikat;
CREATE DATABASE coches_erikat;
USE coches_erikat;
CREATE TABLE coche(
    matricula VARCHAR(10) PRIMARY KEY,
    MARCA VARCHAR(20),
    MODELO VARCHAR(20),
    TIPO VARCHAR(10)
);