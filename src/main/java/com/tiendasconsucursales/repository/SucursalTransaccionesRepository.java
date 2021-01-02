package com.tiendasconsucursales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiendasconsucursales.entity.Sucursal;

//repositorio que maneja la conexion a la base de datos (spring data utiliza una interfaz 
//para gestionar el repositorio que contiene la conexion)

@Repository
public interface SucursalTransaccionesRepository extends JpaRepository<Sucursal, Long> {}
