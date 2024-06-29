package com.CubanEngieneer.Api_Rest_EVCS.Controllers;

import com.CubanEngieneer.Api_Rest_EVCS.Models.ChargingStation;
import com.CubanEngieneer.Api_Rest_EVCS.Services.ChargingStationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class ChargingStationControllerTest {

    @Mock
    private ChargingStationService chargingStationService;

    @InjectMocks
    private  ChargingStationController chargingStationController;

    private ChargingStation chargingStation;

    @BeforeEach
    void setUp() {
        initMocks(this);

        chargingStation= new ChargingStation();
        chargingStation.setId("id1");
        chargingStation.setLocation( new ChargingStation.Location());
        chargingStation.setChargerType(ChargingStation.ChargerType.AC);
        chargingStation.setNumberOfChargingPoints(3);
        chargingStation.setStatus(ChargingStation.Status.available);
    }

    @Test
    void getChargingStationDetails() {
        when(chargingStationController.getChargingStationDetails("id1")).thenReturn(chargingStation);
        assertNotNull(chargingStationController.getChargingStationDetails("id1"));

    }

    @Test
    void getAllChargingStationDetails() {
        when(chargingStationController.getAllChargingStationDetails()).thenReturn(Arrays.asList(chargingStation));
        assertNotNull(chargingStationController.getAllChargingStationDetails());

    }

    @Test
    void createChargingStation() {
        when(chargingStationController.createChargingStation(chargingStation)).thenReturn("Charging Station Created Successfully");
        assertNotNull(chargingStationController.createChargingStation(chargingStation));
    }

    @Test
    void updateChargingStation() {
        when(chargingStationService.updateChargingStation(chargingStation)).thenReturn("Charging Station Created Successfully");
        assertNotNull(chargingStationController.updateChargingStation(chargingStation));
    }

    @Test
    void deleteChargingStation() {
        when(chargingStationController.deleteChargingStation("id1")).thenReturn("Charging Station Created Successfully");
        assertNotNull(chargingStationController.deleteChargingStation("id1"));
    }
}