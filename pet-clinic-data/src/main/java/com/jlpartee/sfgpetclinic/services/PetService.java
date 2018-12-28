package com.jlpartee.sfgpetclinic.services;

import com.jlpartee.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet Save(Pet pet);

    Set<Pet> findAll();
}
