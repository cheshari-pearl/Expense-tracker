package com.akirachix.expensetracker

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.expensetracker.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        expensess()
    }

    fun expensess(){
        val expense1 = Expenses("Salary", "KES 40000", "1 July 2024")
        val expense2 = Expenses("Rent","kES 16000", "2 July 2024" )
        val expense3 = Expenses("Dividends", "KES 2400","3 July 2024 ")



        val expensesList = listOf(expense1, expense2, expense3)
        val expensesAdapter = Expenses_Adapter(expensesList)
//        binding.cvExpenses.layoutManager = LinearLayoutManager(this)
//        binding.cvExpenses.adapter = expensesAdapter
    }

}
