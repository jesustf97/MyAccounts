package com.calleja.jesus.myaccounts.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import com.calleja.jesus.myaccounts.models.Account
import android.view.View
import android.view.ViewGroup
import com.calleja.jesus.myaccounts.R
import kotlinx.android.synthetic.main.account_item.view.*

class AccountsAdapter(private val items: List<Account> ) : RecyclerView.Adapter<AccountsAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent.inflate(R.layout.account_item))
    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])
    override fun getItemCount() = items.size



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(account: Account) = with(itemView){
            accountName.text = account.name
            balanceInCents.text = account.balanceInCents.toString()
            currency.text = account.currency
            accountId.text = account.id
            accountNumber.text = account.id
            accountType.text = account.type
            alias.text = account.alias
            iban.text = account.iban
            linkedAccountId.text = account.linkedAccountId
            productName.text = account.productName
            productType.text = account.productType
            savingsTargetReached.text = account.savingsTargetReached
            targetAmount.text = account.targetAmountInCents.toString()
        }
    }

fun ViewGroup.inflate(layoutId:Int) = LayoutInflater.from(context).inflate(layoutId, this, false)
}
