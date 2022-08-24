package com.tnsif.placementrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.placemententity.Placement;

public interface PlacementRepository extends JpaRepository<Placement,Integer>{

}
