package com.plcoding.cryptocurrencyapp.di

import com.plcoding.cryptocurrencyapp.common.Constants
import com.plcoding.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.plcoding.cryptocurrencyapp.data.respository.CoinRepositoryImpl
import com.plcoding.cryptocurrencyapp.domain.respository.CoinRepository
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

    @Provides
    @Singleton
    fun providePaprikaApi():CoinPaprikaApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi):CoinRepository{
        return CoinRepositoryImpl(api)
    }
}