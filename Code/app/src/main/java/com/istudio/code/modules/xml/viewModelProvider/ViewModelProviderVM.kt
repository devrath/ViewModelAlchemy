package com.istudio.code.modules.xml.viewModelProvider

import android.util.Log
import androidx.lifecycle.ViewModel

class ViewModelProviderVM : ViewModel() {

    fun demo() {
        Log.d("Superman", "Demo is running")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("Superman", "OnCleared of ViewModel function is triggered")
    }


}