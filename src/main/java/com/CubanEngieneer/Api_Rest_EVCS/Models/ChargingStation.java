package com.CubanEngieneer.Api_Rest_EVCS.Models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="Charging_Station")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChargingStation {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @Parameter(name = "uuid_gen_strategy_class", value = "org.hibernate.id.uuid.CustomVersionOneStrategy")
            }
    )
    private String id;
    @Embedded
    private Location location;
    @Enumerated(EnumType.STRING)
    private ChargerType chargerType;
    private int numberOfChargingPoints;
    @Enumerated(EnumType.STRING)
    private Status status;



    public enum ChargerType {
        AC,
        DC_Fast_Charger
    }
    public enum Status {
        available,
        in_Use
    }

    @Embeddable
    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Location {
        private String address;
        private double latitude;
        private double longitude;
    }
}
