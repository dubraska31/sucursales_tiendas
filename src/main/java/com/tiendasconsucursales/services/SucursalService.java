package com.tiendasconsucursales.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiendasconsucursales.entity.Sucursal;
import com.tiendasconsucursales.repository.SucursalTransaccionesRepository;

@Service
public class SucursalService {

	@Autowired
	SucursalTransaccionesRepository sucursalTransaccionesRepository;
	
	
	public List<Sucursal> getSucursales() {
		return sucursalTransaccionesRepository.findAll();
	}
	
	public Sucursal getSucursalById(long id) {
		return sucursalTransaccionesRepository.findById(id).get();
	}
	
	public Sucursal createSucursal(Sucursal sucursal) {
		return sucursalTransaccionesRepository.save(sucursal);
	}
	
	public Sucursal updateSucursal(Sucursal sucursal) {
		return sucursalTransaccionesRepository.save(sucursal);
	}
	
	public void deleteSucursal(long id){  
		sucursalTransaccionesRepository.deleteById(id);
	} 
	
	
}

