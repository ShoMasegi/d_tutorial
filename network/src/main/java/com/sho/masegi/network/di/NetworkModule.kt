package com.sho.masegi.network.di

import com.sho.masegi.network.ApplicationJsonAdapterFactory
import com.sho.masegi.network.GitHubApi
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton @Provides
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder().build()

    @Singleton @Provides
    fun provideConverterFactory(): Converter.Factory {
        val moshi = Moshi.Builder()
            .add(ApplicationJsonAdapterFactory.instance)
            .build()
        return MoshiConverterFactory.create(moshi)
    }

    @Singleton @Provides
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        converterFactory: Converter.Factory
    ): Retrofit =
        Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://api.github.com")
            .addConverterFactory(converterFactory)
            .build()

    @Singleton @Provides
    fun provideGitHubApi(retrofit: Retrofit): GitHubApi = retrofit.create(GitHubApi::class.java)
}