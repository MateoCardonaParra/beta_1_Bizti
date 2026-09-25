package com.example.beta_1_Bizti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beta_1_Bizti.models.Registro;
import com.example.beta_1_Bizti.repository.IRepositorioRegistro;

@Service 
public class ServiciosRegistros {

@Autowired 
private IRepositorioRegistro repositorioRegistro;
  
//Operaciones
//Guardar
public Registro guardarRegistro(Registro datosRegistro) {
  return this.repositorioRegistro.save(datosRegistro);

}
}
