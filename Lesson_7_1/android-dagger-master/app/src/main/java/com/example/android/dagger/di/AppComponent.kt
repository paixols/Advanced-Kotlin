package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

/*
* A @Component interface gives Dagger the information it needs to generate the graph at compile-time
* The parameter on the interface methods define what classes require injection.
* */

@Component(
    modules = [StorageModule::class]
)
interface AppComponent {

    /*
    * Factory to create instances of the [AppComponent]
    * [@BindsInstance] is used for components that are constructed outside the graph, like Context
    * */
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: RegistrationActivity)

}