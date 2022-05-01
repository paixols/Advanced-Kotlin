package com.example.android.dagger.user

import javax.inject.Scope

/**
 * Since we've been using the Activity Scope Annotation to annotate components that have the
 * Activity managing it's lifetime, we need a scope that can cover multiple activities but not
 * all the application.
 * This scope covers the lifetime when the user is logged in.
 * */

@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class LoggedUserScope