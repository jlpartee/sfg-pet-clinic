package com.jlpartee.sfgpetclinic.bootstrap;

import com.jlpartee.sfgpetclinic.model.Owner;
import com.jlpartee.sfgpetclinic.model.Vet;
import com.jlpartee.sfgpetclinic.services.OwnerService;
import com.jlpartee.sfgpetclinic.services.VetService;
import com.jlpartee.sfgpetclinic.services.map.OwnerServiceMap;
import com.jlpartee.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michaelle");
        owner1.setLastName("Winston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Robert");
        owner2.setLastName("Mitchel");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ... \n\t" + owner1 + "\n\t" + owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Ash");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets ...\n\t" + vet1 + "\n\t" + vet2);
    }
}
