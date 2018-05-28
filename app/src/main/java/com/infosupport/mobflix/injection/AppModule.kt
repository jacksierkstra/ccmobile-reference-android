package com.infosupport.mobflix.injection

import android.app.Application
import android.content.Context

import dagger.Binds
import dagger.Module

/**
 * This is a Dagger module. We use this to bind our Application class as a Context in the AppComponent
 * By using Dagger Android we do not need to pass our Application instance to any module,
 * we simply need to expose our Application as Context.
 * One of the advantages of Dagger.Android is that your
 * Application & Activities are provided into your graph for you.
 * [ ].
 */
@Suppress("unused")
@Module
abstract class AppModule {
    //expose Application as an injectable context
    @Binds
    internal abstract fun bindContext(application: Application): Context
}

