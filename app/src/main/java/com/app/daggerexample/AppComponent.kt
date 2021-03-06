package com.app.daggerexample

import dagger.Component
import javax.inject.Singleton

// The Component is declaring what and where to inject.
// A Component should always be an interface.
// Dagger will generate a class Add `Dagger` in front of the component name, DaggerAppComponent in this case.
@Singleton
@Component
interface AppComponent {
    // You can name it anything, such as `poke()`. It doesn't have to be `inject()`
    fun inject(activity: MainActivity)
}

