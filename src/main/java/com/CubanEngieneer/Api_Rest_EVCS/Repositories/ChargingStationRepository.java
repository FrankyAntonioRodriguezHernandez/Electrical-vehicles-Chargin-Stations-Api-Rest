package com.CubanEngieneer.Api_Rest_EVCS.Repositories;

import com.CubanEngieneer.Api_Rest_EVCS.Models.ChargingStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargingStationRepository extends JpaRepository<ChargingStation, String> {

}
