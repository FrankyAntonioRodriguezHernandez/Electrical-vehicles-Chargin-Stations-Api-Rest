package com.CubanEngieneer.Api_Rest_EVCS.Services.Impl;

import com.CubanEngieneer.Api_Rest_EVCS.Models.ChargingStation;
import com.CubanEngieneer.Api_Rest_EVCS.Repositories.ChargingStationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ChargingStationServiceImplTest {

    @Mock
    private ChargingStationRepository chargingStationRepository;

    @InjectMocks
    private ChargingStationServiceImpl chargingStationServiceImpl;

    private ChargingStation chargingStation;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        chargingStation= new ChargingStation();
        chargingStation.setId("id1");
        chargingStation.setLocation( new ChargingStation.Location());
        chargingStation.setChargerType(ChargingStation.ChargerType.AC);
        chargingStation.setNumberOfChargingPoints(3);
        chargingStation.setStatus(ChargingStation.Status.available);

    }

    @Test
    void getAllChargingStation() {
        when(chargingStationRepository.findAll()).thenReturn(Arrays.asList(chargingStation));
        assertNotNull(chargingStationServiceImpl.chargingStationRepository.findAll());
    }

    @Test
    void getChargingStation() {
        when(chargingStationRepository.findById ("id1")).thenReturn(Optional.ofNullable(chargingStation));
        assertNotNull(chargingStationServiceImpl.getChargingStation("id1"));
    }

    @Test
    void createChargingStation() {
        when(chargingStationRepository.save(chargingStation)).thenReturn(chargingStation);
        assertNotNull(chargingStationServiceImpl.createChargingStation(chargingStation));
    }

    @Test
    void updateChargingStation() {
        when(chargingStationRepository.save(chargingStation)).thenReturn(chargingStation);
        assertNotNull(chargingStationServiceImpl.createChargingStation(chargingStation));
    }

}