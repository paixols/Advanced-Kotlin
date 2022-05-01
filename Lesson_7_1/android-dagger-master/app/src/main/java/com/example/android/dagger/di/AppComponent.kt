package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/*
* A @Component interface gives Dagger the information it needs to generate the graph at compile-time
* The parameter on the interface methods define what classes require injection.
*
* Uses scopes to have a unique instance of a type in a component.
* @Singleton is the only scope annotation included in [javax.inject]
* */

@Singleton
@Component(
    modules = [StorageModule::class, AppSubcomponents::class]
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

    //Types that can be retrieved from the graph
    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory

    /*
    * Expose [UserManager] so that [MainActivity] and [SettingsActivity] can access a
    * particular instance of [UserComponent]
    * */
    fun userManager(): UserManager
}