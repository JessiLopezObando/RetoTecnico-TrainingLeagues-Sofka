package com.retosofka.estacionespacial.repositories;

import com.retosofka.estacionespacial.entities.Nave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaveRepository extends JpaRepository<Nave,Long> {
}