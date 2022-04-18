package com.example.jetpackarchitecturepractice.data.persistence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.jetpackarchitecturepractice.model.dto.AccountPropertiesDTO

@Dao
interface AccountPropertiesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAndReplace(accountPropertiesDTO: AccountPropertiesDTO): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAndIgnore(accountPropertiesDTO: AccountPropertiesDTO): Long

    @Query("SELECT * FROM account_properties WHERE pk = :pk")
    suspend fun searchByPk(pk: Int): LiveData<AccountPropertiesDTO>

    @Query("SELECT * FROM account_properties WHERE email = :email")
    suspend fun searchByEmail(email: String): LiveData<AccountPropertiesDTO>
}