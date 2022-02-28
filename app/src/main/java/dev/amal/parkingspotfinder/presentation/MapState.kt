package dev.amal.parkingspotfinder.presentation

import com.google.maps.android.compose.MapProperties
import dev.amal.parkingspotfinder.domain.model.ParkingSpot

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = false
)