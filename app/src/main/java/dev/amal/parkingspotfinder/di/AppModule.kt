package dev.amal.parkingspotfinder.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.amal.parkingspotfinder.data.ParkingSpotDatabase
import dev.amal.parkingspotfinder.data.ParkingSpotRepositoryImpl
import dev.amal.parkingspotfinder.domain.repository.ParkingSpotRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app: Application): ParkingSpotDatabase =
        Room.databaseBuilder(
            app, ParkingSpotDatabase::class.java, "parking_spots.db"
        ).build()

    @Singleton
    @Provides
    fun provideParkingSpotRepository(db: ParkingSpotDatabase): ParkingSpotRepository =
        ParkingSpotRepositoryImpl(db.dao)
}