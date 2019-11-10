package com.sho.masegi.network

import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubApi {
    @GET("/events")
    suspend fun events(@Query("page") page: Int): Unit
}