package com.app.daggerexample
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Info @Inject constructor() {
    var text = "Hello Dagger 2"

    fun getData(): String {
        return "I am Dagger 2"

    }
}