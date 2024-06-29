package com.CubanEngieneer.Api_Rest_EVCS.Controllers;

import com.CubanEngieneer.Api_Rest_EVCS.Models.ChargingStation;
import com.CubanEngieneer.Api_Rest_EVCS.Services.ChargingStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ChargingStation")
public class ChargingStationController {

    private final ChargingStationService chargingStationService;

    @Autowired
    public ChargingStationController(ChargingStationService chargingStationService) {
        this.chargingStationService = chargingStationService;
    }

    @GetMapping("{ChargingStationID}")
    public ChargingStation getChargingStationDetails(@PathVariable("chargingStationId") String chargingStationId){

        return chargingStationService.getchargingStation(chargingStationId);
    }

    @GetMapping()
    public List<ChargingStation> getAllChargingStationDetails(){

        return chargingStationService.getAllChargingStation();
    }

    @PostMapping
    public String createChargingStation(@RequestBody ChargingStation chargingStation){
        chargingStationService.createChargingStation(chargingStation);
        return "Charging Station Created Successfully";
    }
    @PutMapping
    public String updateChargingStation(@RequestBody ChargingStation chargingStation){
        chargingStationService.updateChargingStation(chargingStation);
        return "Charging Station Updated Successfully";
    }

    @DeleteMapping
    public String deleteChargingStation(@PathVariable("chargingStationId") String chargingStationId){
        chargingStationService.deleteChargingStation(chargingStationId);
        return "Charging Station Deleted Successfully";
    }
}