package org.mock.library

import io.micronaut.context.annotation.EachProperty
import javax.inject.Inject

@EachProperty(Test.PREFIX)
class Test(@Inject private val singletonClass: SingletonClass) {

    private var url: String? = null
    fun setUrl(url: String?) {
        this.url = url
    }
    fun getUrl(): String? {
        return url
    }
    companion object {
        const val PREFIX = "micronaut.test"
    }
}