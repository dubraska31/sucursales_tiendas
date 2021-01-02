package com.tiendasconsucursales.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tiendasconsucursales.entity.Sucursal;
import com.tiendasconsucursales.services.SucursalService;

@RestController
public class SucursalController {

	@Autowired
	SucursalService sucursalService;
	
	@GetMapping("/sucursales")
	public List<Sucursal> getSucursales() {
		return sucursalService.getSucursales();
	}	
		
	@GetMapping("/sucursales/{id}")
	public Sucursal getSucursalById(@PathVariable long id) {
		return sucursalService.getSucursalById(id);
	}
	
	@PostMapping("/sucursales")
	public Sucursal createSucursal(@RequestBody Sucursal sucursal) {
		return sucursalService.createSucursal(sucursal);
	}
	
	@PutMapping("/sucursales")
    public Sucursal updateSucursal(@RequestBody Sucursal sucursal) {
		return sucursalService.updateSucursal(sucursal);
	}

	@DeleteMapping("/sucursales/{id}")
	public void deleteSucursal(@PathVariable long id){
		sucursalService.deleteSucursal(id);
	}
	
	
}
	
