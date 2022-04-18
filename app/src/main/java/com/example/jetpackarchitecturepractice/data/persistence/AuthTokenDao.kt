package com.example.jetpackarchitecturepractice.data.persistence

import androidx.room.*
import com.example.jetpackarchitecturepractice.data.dto.cach.AuthTokenDTO

@Dao
interface AuthTokenDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAndReplace(authTokenDTO: AuthTokenDTO): Long

    @Query("UPDATE auth_token SET token=null WHERE account_pk = :pk")
    fun nullifyToken(pk: Int): Int
}