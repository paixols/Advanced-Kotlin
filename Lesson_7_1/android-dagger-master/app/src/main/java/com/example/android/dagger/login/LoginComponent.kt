package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import dagger.Subcomponent

/*
* Classes annotated with [@ActivityScope] will have a unique instance in this component
* We annotate it with this, since the component will have the same lifetime as [LoginActivity]
* */
@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    //Classes that can be injected by this component
    fun inject(activity: LoginActivity)

}