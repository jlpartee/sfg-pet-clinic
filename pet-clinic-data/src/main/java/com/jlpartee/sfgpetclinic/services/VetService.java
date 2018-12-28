package com.jlpartee.sfgpetclinic.services;

import com.jlpartee.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet Save(Vet vet);

    Set<Vet> findAll();
}
