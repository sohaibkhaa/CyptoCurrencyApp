package com.plcoding.cryptocurrencyapp.pressentation.coin_detail

import com.plcoding.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
