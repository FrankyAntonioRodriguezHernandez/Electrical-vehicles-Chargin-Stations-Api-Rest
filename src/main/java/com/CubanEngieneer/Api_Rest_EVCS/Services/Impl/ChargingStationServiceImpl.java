package com.CubanEngieneer.Api_Rest_EVCS.Services.Impl;

import com.CubanEngieneer.Api_Rest_EVCS.Models.ChargingStation;
import com.CubanEngieneer.Api_Rest_EVCS.Repositories.ChargingStationRepository;
import com.CubanEngieneer.Api_Rest_EVCS.Services.ChargingStationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargingStationServiceImpl implements ChargingStationService{

    ChargingStationRepository chargingStationRepository;
    public ChargingStationServiceImpl(ChargingStationRepository chargingStationRepository) {
        this.chargingStationRepository = chargingStationRepository;
    }

    @Override
    public String createChargingStation(ChargingStation chargingStation) {
        chargingStationRepository.save(chargingStation);

        return "Success";
    }

    @Override
    public String updateChargingStation(ChargingStation chargingStation) {
        chargingStationRepository.save(chargingStation);
        return "Success";
    }

    @Override
    public String deleteChargingStation(String chargingStationId) {
        chargingStationRepository.deleteById(chargingStationId);
        return "Success";
    }

    @Override
    public ChargingStation getchargingStation(String chargingStationId) {
        return chargingStationRepository.findById(chargingStationId).get();
    }

    @Override
    public List<ChargingStation> getAllChargingStation() {
        return chargingStationRepository.findAll() ;
    }
}