package com.adoyo.wastesort.di

import com.adoyo.wastesort.data.remote.ApiService
import com.adoyo.wastesort.data.repository.GarbageRepositoryImpl
import com.adoyo.wastesort.domain.repository.GarbageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
       return Retrofit.Builder()
            .baseUrl("https://keremberke-garbage-object-detection.hf.space/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun provideGarbageRepository(apiService: ApiService): GarbageRepository {
        return GarbageRepositoryImpl(apiService)
    }
}