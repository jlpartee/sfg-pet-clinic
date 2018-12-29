package com.jlpartee.sfgpetclinic.services;

import com.jlpartee.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
