package com.walton.awaz.navigation

import com.walton.common_utils.Activities
import com.walton.common_utils.Navigator
import com.walton.distributor_presentation.GotoDistributorActivity
import com.walton.employee_presentation.GotoEmployeeActivity

class DefaultNavigator: Navigator.Provider{
  override fun getActivities(activities: Activities): Navigator {

   return when(activities){
     Activities.DistributorActivity-> {
         GotoDistributorActivity
     }
     Activities.EmployeeActivity-> {
        GotoEmployeeActivity
     }

   }

  }

}
