package com.example.jetpackarchitecturepractice.data.persistence

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [
        AccountPropertiesDao::class,
        AuthTokenDao::class
    ],
    version = 1
)
abstract class AppDataBase : RoomDatabase() {

    abstract fun getAccountPropertiesDao(): AccountPropertiesDao

    abstract fun getAuthTokenDao(): AuthTokenDao

    companion object {
        const val DATABASE_NAME = "app_db"
    }
}