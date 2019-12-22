package com.sho.masegi.network

import com.sho.masegi.model.Event
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubApi {
    @GET("/events")
    suspend fun events(@Query("page") page: Int): List<Event>
}