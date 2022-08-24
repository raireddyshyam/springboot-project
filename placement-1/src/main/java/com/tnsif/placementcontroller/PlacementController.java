package com.tnsif.placementcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placemententity.Placement;
import com.tnsif.placementservice.PlacementService;

@RestController
public class PlacementController {
	
	@Autowired
	private PlacementService service;
	
	//add placement
		@PostMapping("/addplacement")
		public List<Placement> addplacement(@RequestBody List<Placement> placement) {
			return service.findPlacement(placement);
		}
		
		//update placement
		@PutMapping("/updateplacement")
		public Placement updatePlacement(Placement placement) {
			return service.updatePlacement(placement);
		}
		
		//search placement
		@GetMapping("/placement/{id}")
		public Placement FindPlacementById(@PathVariable int id) {
			return service.getPlacementById(id);
		}
		
		//cancel placement
		@DeleteMapping("/delete/{id}")
		public String cancelPlacement(@PathVariable int id) {
			return service.cancelPlacement(id);
		}

}
