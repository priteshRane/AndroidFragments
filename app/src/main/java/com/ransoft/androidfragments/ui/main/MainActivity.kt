package com.ransoft.androidfragments.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ransoft.androidfragments.R
import com.ransoft.androidfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.mainviewmodel = viewModel

        viewModel.mainListener = this
    }
}
