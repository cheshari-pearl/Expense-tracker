package com.akirachix.expensetracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Expenses_Adapter(val expensesList: List<Expenses>): RecyclerView.Adapter<ExpensesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.expense_list_item, parent, false)
        return ExpensesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return expensesList.size
    }
    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
        val expenses = expensesList[position]

    }
}
class ExpensesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
}