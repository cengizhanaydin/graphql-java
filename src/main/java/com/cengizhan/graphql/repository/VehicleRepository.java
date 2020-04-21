package com.cengizhan.graphql.repository;

import com.cengizhan.graphql.dto.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository  extends JpaRepository<Vehicle, Integer> {
}
