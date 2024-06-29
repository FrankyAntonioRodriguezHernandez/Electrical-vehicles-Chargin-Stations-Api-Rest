package com.CubanEngieneer.Api_Rest_EVCS.Services;

import com.CubanEngieneer.Api_Rest_EVCS.Models.ChargingStation;
import java.util.List;

public interface ChargingStationService {
    public String createChargingStation(ChargingStation chargingStation);
    public String updateChargingStation(ChargingStation chargingStation);
    public String deleteChargingStation(String chargingStationId);
    public ChargingStation getchargingStation(String chargingStationId);
    public List<ChargingStation> getAllChargingStation();
}