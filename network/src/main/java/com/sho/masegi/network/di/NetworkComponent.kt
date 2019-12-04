package com.sho.masegi.network.di

import com.sho.masegi.network.GitHubApi
import dagger.Component
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface NetworkComponent {
    fun provideOkHttpClient(): OkHttpClient
    fun provideRetrofit(): Retrofit
    fun provideGitHubApi(): GitHubApi

    @Component.Builder
    interface Builder {
        fun build(): NetworkComponent
    }

    companion object {
        fun builder(): Builder = DaggerNetworkComponent.builder()
    }
}