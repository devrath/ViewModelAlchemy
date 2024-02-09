package com.istudio.code.modules.xml.viewModelProvider

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.istudio.code.R

class ViewModelProviderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_model_provider_activity)
        Log.d("Superman", "OnCreate function of Activity is triggered")

        // Use the ViewModelProvider with this Activity.
        val myViewModel = ViewModelProvider(this)[ViewModelProviderVM::class.java]
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Superman", "OnDestroy function of Activity is triggered")
        // Clear the ViewModelStore when the Activity is destroyed.

    }
}