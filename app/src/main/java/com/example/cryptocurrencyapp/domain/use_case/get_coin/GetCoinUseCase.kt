package com.example.cryptocurrencyapp.domain.use_case.get_coin

import com.example.cryptocurrencyapp.common.Resource
import com.example.cryptocurrencyapp.domain.model.CoinDetail
import com.example.cryptocurrencyapp.domain.respository.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

private const val TAG = "GetCoinUseCase"
class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId:String): Flow<Resource<CoinDetail>> = repository.getCoinById(coinId)
}