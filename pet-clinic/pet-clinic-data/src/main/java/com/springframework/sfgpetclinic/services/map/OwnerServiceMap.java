package com.springframework.sfgpetclinic.services.map;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>  {

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save( object);
	}

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(Owner object) {
		this.delete(object);
	}

	@Override
	public void deleteById(Long id) {

		this.deleteById(id);
	}

}
