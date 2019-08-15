package com.calleja.jesus.myaccounts.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.calleja.jesus.myaccounts.R
import com.calleja.jesus.myaccounts.adapters.AccountsAdapter
import com.calleja.jesus.myaccounts.data.readAccountsList
import kotlinx.android.synthetic.main.fragment_accounts.view.*

class AllAccounts : Fragment() {

    private lateinit var _view: View
    private lateinit var adapter: AccountsAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _view = inflater.inflate(R.layout.fragment_accounts, container, false)
        setUpRecyclerView()

        return _view
    }

    private fun setUpRecyclerView() {
        val layoutManager = LinearLayoutManager(context)
        adapter = AccountsAdapter(readAccountsList())
        _view.recyclerViewAccountsFragment.setHasFixedSize(true)
        _view.recyclerViewAccountsFragment.layoutManager = layoutManager
        _view.recyclerViewAccountsFragment.itemAnimator = DefaultItemAnimator()
        _view.recyclerViewAccountsFragment.adapter = adapter

    }
}
