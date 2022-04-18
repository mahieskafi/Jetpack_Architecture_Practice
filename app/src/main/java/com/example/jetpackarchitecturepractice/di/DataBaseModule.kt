package com.example.jetpackarchitecturepractice.di

import android.app.Application
import androidx.room.Room
import com.example.jetpackarchitecturepractice.data.persistence.AccountPropertiesDao
import com.example.jetpackarchitecturepractice.data.persistence.AppDataBase
import com.example.jetpackarchitecturepractice.data.persistence.AuthTokenDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideAppDB(@ApplicationContext application: Application): AppDataBase {
        return Room.databaseBuilder(application, AppDataBase::class.java, AppDataBase.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideAccountPropertiesDao(appDataBase: AppDataBase): AccountPropertiesDao {
        return appDataBase.getAccountPropertiesDao()
    }

    @Provides
    fun provideAuthTokenDao(appDataBase: AppDataBase): AuthTokenDao {
        return appDataBase.getAuthTokenDao()
    }
}