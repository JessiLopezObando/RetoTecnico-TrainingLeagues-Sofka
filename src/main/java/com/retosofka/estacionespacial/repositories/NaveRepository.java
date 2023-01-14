package com.retosofka.estacionespacial.repositories;

import com.retosofka.estacionespacial.models.NaveDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaveRepository extends CrudRepository<NaveDTO,Long> {
}

