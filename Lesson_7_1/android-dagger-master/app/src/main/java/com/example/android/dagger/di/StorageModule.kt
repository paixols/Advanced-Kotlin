package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

/*
* Dagger @Modules tell Dagger how to provide instances of certain type.
* Since [Storage] is an interface and as such it can't be instantiated directly, we need to tell
* Dagger which implementation of [Storage] we want to use.
* */

@Module
abstract class StorageModule {

    /*
    * @Binds tells dagger which implementation it needs to use when providing an interface.
    * The implementation is specified by adding a parameter with the interface implementation, in
    * this case [SharedPreferencesStorage]
    * */
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage

}