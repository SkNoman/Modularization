package com.walton.employee_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.walton.common_utils.Activities
import com.walton.common_utils.Navigator
import com.walton.employee_presentation.databinding.ActivityEmployeeBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class EmployeeActivity : AppCompatActivity() {

    @Inject
    lateinit var provider:Navigator.Provider

    private var _binding: ActivityEmployeeBinding? = null
    private val binding: ActivityEmployeeBinding
    get() = _binding!!

    companion object{
        fun launchActivity(activity: Activity){
            val intent = Intent(activity,EmployeeActivity::class.java)
            activity.startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= ActivityEmployeeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.demoText.setOnClickListener {
            provider.getActivities(Activities.DistributorActivity).navigate(this)
        }

    }
}

object GotoEmployeeActivity: Navigator {
    override fun navigate(activity: Activity) {
        EmployeeActivity.launchActivity(activity)
    }

}