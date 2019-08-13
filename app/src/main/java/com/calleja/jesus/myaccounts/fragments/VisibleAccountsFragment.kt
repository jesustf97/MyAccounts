package com.calleja.jesus.myaccounts.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.calleja.jesus.myaccounts.R
import com.calleja.jesus.myaccounts.models.Account
import java.util.ArrayList

class VisibleAccounts : Fragment() {

    private var expensesList: ArrayList<Account> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_visible_accounts, container, false)
    }

}
