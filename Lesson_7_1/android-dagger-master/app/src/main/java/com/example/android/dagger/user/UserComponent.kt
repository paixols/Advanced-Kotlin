package com.example.android.dagger.user

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

/*
* The lifetime of [UserComponent]?
* [LoginComponent] & [RegistrationComponent] are managed by its Activities but [UserComponent] can
* inject more than one Activity and the number of Activities could potentially increase.
*
* We annotate this Subcomponent with [@LoggedUserScope] so that [UserComponent] can always provide
* the same instance of [UserDataRepository]
* */

@LoggedUserScope
@Subcomponent
interface UserComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    //Classes that can be injected by this Component
    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)

}