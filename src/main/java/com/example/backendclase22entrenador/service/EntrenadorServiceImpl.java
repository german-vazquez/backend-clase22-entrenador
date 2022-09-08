package com.example.backendclase22entrenador.service;

import com.example.backendclase22entrenador.dao.EntrenadorDAOH2;
import com.example.backendclase22entrenador.dao.IDao;
import com.example.backendclase22entrenador.dominio.Entrenador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorServiceImpl implements IEntrenadorService{
    private IDao<Entrenador> entrenadorIDao;


    // cargamos el dao
    public EntrenadorServiceImpl() {
        entrenadorIDao = new EntrenadorDAOH2();
    }

    @Override
    public List<Entrenador> listarEntrenadores() {
        return entrenadorIDao.listarTodos();
    }
}
