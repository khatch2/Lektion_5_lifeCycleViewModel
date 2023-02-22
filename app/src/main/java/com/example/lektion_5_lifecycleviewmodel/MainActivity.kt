package com.example.lektion_5_lifecycleviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lektion_5_lifecycleviewmodel.databinding.ActivityMainBinding

// private const val name: String = ""

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Init binding
    private lateinit var counterViewModel: Counter    // Init Counter

    // TODO - Activity ID - Best practice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initializing variables
        val txCounter: TextView = binding.textViewCounter
        counterViewModel = ViewModelProvider(this)[Counter().javaClass]

        txCounter.text = counterViewModel.value.toString()  // On Creation, Set value

        // Onclick
        txCounter.setOnClickListener {
            counterViewModel.add()
            txCounter.text = counterViewModel.value.toString()
            println("Current Counter Value is: ${counterViewModel.value}")
        }

    }
}