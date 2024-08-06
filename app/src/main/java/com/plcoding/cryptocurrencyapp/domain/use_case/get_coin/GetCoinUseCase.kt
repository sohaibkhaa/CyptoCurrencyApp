package com.plcoding.cryptocurrencyapp.domain.use_case.get_coin

import com.plcoding.cryptocurrencyapp.common.Resource
import com.plcoding.cryptocurrencyapp.domain.model.CoinDetail
import com.plcoding.cryptocurrencyapp.domain.respository.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

private const val TAG = "GetCoinUseCase"
class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId:String): Flow<Resource<CoinDetail>> = repository.getCoinById(coinId)
}