package com.calleja.jesus.myaccounts.data

import com.calleja.jesus.myaccounts.models.Account

class DataSource {
    val account1 =
        Account(985000.0, "EUR", "748757694",
            "Hr P L G N StellingTD", "748757694",
            "PAYMENT", "", true, "NL23INGB0748757694")

    val account2 =
        Account(1000000.0, "EUR", "700000027559",
            ",", "748757732",
            "PAYMENT", "", false, "NL88INGB0748757732")

    val account3 =
        Account(15000.0, "EUR", "700000027559",
            "", "H 177-27066",
            "SAVING", "G\\UfffdLSAVINGSdiacrits", true,
            "", "748757694",
            "Oranje Spaarrekening","1000",
            "1", 2000.0)



}