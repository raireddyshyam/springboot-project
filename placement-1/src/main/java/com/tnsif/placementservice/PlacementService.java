package com.tnsif.placementservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tnsif.placemententity.Placement;
import com.tnsif.placementrepository.PlacementRepository;

@Service
@Transactional
public class PlacementService {
	
	@Autowired
	private PlacementRepository repository;
	
	//finding the placement
		public List<Placement> findPlacement(List<Placement> placement) {
			return repository.findAll();
		}
		
		//update placement
		public Placement updatePlacement(Placement placement) {
			Placement existingplacement=repository.findById(placement.getId()).orElse(null);
			existingplacement.setName(placement.getName());
			existingplacement.setCollege(placement.getCollege());
			existingplacement.setDate(placement.getDate());
			existingplacement.setQualification(placement.getQualification());
			existingplacement.setYear(placement.getYear());
			return repository.save(existingplacement);
		}
		
		//search placement by id 
		public Placement getPlacementById(int id) {
			return repository.findById(id).orElse(null);
		}
		
		//cancel placement by id
		public String cancelPlacement(int id) {
			repository.deleteById(id);
			return "placement cancelled";
		}
}
