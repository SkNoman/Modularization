package com.walton.awaz

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.walton.awaz.databinding.ActivityMainBinding
import com.walton.common_utils.Activities
import com.walton.common_utils.Navigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var provider:Navigator.Provider

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
    get() = _binding!!

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this,R.color.blue)
        _binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtAWAZSplashScreen.setOnClickListener {
            provider.getActivities(Activities.EmployeeActivity).navigate(this)
        }
    }
}