package com.springframework.sfgpetclinic.services.map;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService  {
	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save( object);
	}

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(Vet object) {
		this.delete(object);
	}

	@Override
	public void deleteById(Long id) {

		this.deleteById(id);
	}

}
