package com.ransoft.androidfragments.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import com.ransoft.androidfragments.R
import com.ransoft.androidfragments.databinding.ActivityMainBinding
import com.ransoft.androidfragments.ui.article.ArticleActivity
import com.ransoft.androidfragments.util.toast

class MainActivity : AppCompatActivity(), MainListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.mainviewmodel = viewModel

        viewModel.mainListener = this
    }

    override fun goToFragmentPackage() {
        toast("Go to Fragment package")
        val intent = Intent(this, ArticleActivity::class.java)
        startActivity(intent)
    }
}
