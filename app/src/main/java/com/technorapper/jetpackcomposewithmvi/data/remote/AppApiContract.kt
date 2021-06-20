package com.technorapper.jetpackcomposewithmvi.data.remote

import com.google.gson.JsonObject
import retrofit2.http.GET
import retrofit2.http.Query

interface AppApiContract {

    @GET("character")
    suspend fun getCharactersList(@Query("page") page: Int): JsonObject
}