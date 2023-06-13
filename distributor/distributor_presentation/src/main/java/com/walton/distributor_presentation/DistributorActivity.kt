package com.walton.distributor_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.walton.common_utils.Navigator

class DistributorActivity : AppCompatActivity() {

    companion object{
        fun launchActivity(activity: Activity){
            val intent = Intent(activity,DistributorActivity::class.java)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distributor)
    }
}

object GotoDistributorActivity:Navigator{
    override fun navigate(activity: Activity) {
        DistributorActivity.launchActivity(activity)
    }

}