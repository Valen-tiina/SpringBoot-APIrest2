package com.valen.tienda.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import org.springframework.stereotype.Repository;

import com.valen.tienda.model.Producto;

@Repository
public interface TiendaRepository extends ReactiveCrudRepository<Producto, Integer> {

}
