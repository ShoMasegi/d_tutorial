package com.sho.masegi.network.di

import com.sho.masegi.network.GitHubApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton @Provides
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder().build()

    @Singleton @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://api.github.com")
            .build()

    @Singleton @Provides
    fun provideGitHubApi(retrofit: Retrofit): GitHubApi = retrofit.create(GitHubApi::class.java)
}