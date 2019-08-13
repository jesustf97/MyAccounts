package com.calleja.jesus.myaccounts.models

data class Account(
    val balanceInCents: Double = 0.0,
    val currency: String = "",
    val id: String = "",
    val name: String = "",
    val accountNumber: String = "",
    val type: String = "",
    val alias: String = "",
    val visible: Boolean = false,
    val iban: String = "",
    val linkedAccountId: String = "",
    val productName: String = "",
    val productType: String = "",
    val savingsTargetReached: String = "",
    val targetAmountInCents: Double = 0.0
)
