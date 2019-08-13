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
import com.calleja.jesus.myaccounts.models.Account
import com.calleja.jesus.myaccounts.data.readAccountList
import kotlinx.android.synthetic.main.fragment_visible_accounts.view.*
import java.util.ArrayList

class VisibleAccounts : Fragment() {

    private lateinit var _view: View
    private lateinit var adapter: AccountsAdapter
    private var visibleAccountsList: ArrayList<Account> = ArrayList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _view = inflater.inflate(R.layout.fragment_visible_accounts, container, false)
        //setUpAccountsList()
        setUpRecyclerView()

        return _view
    }

    private fun setUpRecyclerView() {
        val layoutManager = LinearLayoutManager(context)
        val aux  = readAccountList()
        adapter = AccountsAdapter(aux)
        _view.recyclerViewAccountsFragment.setHasFixedSize(true)
        _view.recyclerViewAccountsFragment.layoutManager = layoutManager
        _view.recyclerViewAccountsFragment.itemAnimator = DefaultItemAnimator()
        _view.recyclerViewAccountsFragment.adapter = adapter

    }

/*    private fun setUpAccountsList(){
        visibleAccountsList.clear()
        visibleAccountsList.addAll(readAccountList())
       *//* adapter.notifyDataSetChanged()
        _view.recyclerViewAccountsFragment.smoothScrollToPosition(0)*//*

    }*/

}
