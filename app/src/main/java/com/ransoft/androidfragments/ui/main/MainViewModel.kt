package com.ransoft.androidfragments.ui.main

import android.view.View
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var mainListener: MainListener? = null

    fun onGoToFragmentPackageClick(view: View) {
        mainListener?.goToFragmentPackage()
    }
}