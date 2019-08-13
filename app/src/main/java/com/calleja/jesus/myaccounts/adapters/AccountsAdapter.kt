package com.calleja.jesus.myaccounts.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import com.calleja.jesus.myaccounts.models.Account
import android.view.View
import android.view.ViewGroup
import com.calleja.jesus.myaccounts.R

class AccountsAdapter(private val items: List<Account> ) : RecyclerView.Adapter<AccountsAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent.inflate(R.layout.fragment_visible_accounts))
    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])
    override fun getItemCount() = items.size



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(account: Account) = with(itemView){
    /*        textViewExpenseDescription.text = expense.message
            textViewExpenseCategory.text = expense.category
            textViewExpenseAmount.text = expense.amount + " EUR"*/
        }
    }

fun ViewGroup.inflate(layoutId:Int) = LayoutInflater.from(context).inflate(layoutId, this, false)
}
