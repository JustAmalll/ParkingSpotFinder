package dev.amal.parkingspotfinder.data

import dev.amal.parkingspotfinder.domain.model.ParkingSpot

fun ParkingSpotEntity.toParkingSpot(): ParkingSpot =
    ParkingSpot(lat = lat, lng = lng, id = id)

fun ParkingSpot.toParkingSpotEntity(): ParkingSpotEntity =
    ParkingSpotEntity(lat = lat, lng = lng, id = id)
