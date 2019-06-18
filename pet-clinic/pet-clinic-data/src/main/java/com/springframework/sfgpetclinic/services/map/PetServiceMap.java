package com.springframework.sfgpetclinic.services.map;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>  {
	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save( object);
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(Pet object) {
		this.delete(object);
	}

	@Override
	public void deleteById(Long id) {

		this.deleteById(id);
	}

}

