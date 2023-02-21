create database gestion_usuarios;

use gestion_usuarios;

CREATE TABLE usuarios (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  apellido varchar(60) NOT NULL,
  email varchar(60) NOT NULL,
  nombre varchar(60) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_kfsp0s1tflm1cwlj8idhqsad0 (email)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
