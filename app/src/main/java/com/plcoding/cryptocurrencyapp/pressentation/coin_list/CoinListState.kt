package com.plcoding.cryptocurrencyapp.pressentation.coin_list

import com.plcoding.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
