package com.example.jetpackarchitecturepractice.model.dto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "account_properties")
data class AccountPropertiesDTO(

    @SerializedName("pk")
    @Expose
    @ColumnInfo(name = "pk")
    @PrimaryKey(autoGenerate = false)
    var pk: Int,

    @SerializedName("email")
    @Expose
    @ColumnInfo(name = "email") var email: String,

    @SerializedName("username")
    @Expose
    @ColumnInfo(name = "username") var username: String

)


