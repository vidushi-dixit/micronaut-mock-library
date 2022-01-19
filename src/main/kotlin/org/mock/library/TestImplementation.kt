package org.mock.library

import io.micronaut.context.annotation.EachProperty
import javax.inject.Inject

/**
 * Injected in Test class
 */
@EachProperty(TestImplementation.PREFIX)
class TestImplementation(@Inject private val singletonClass: SingletonClass): Test {

    override fun getUrl(): String? {
        return "default"
    }
    companion object {
        const val PREFIX = "micronaut.test"
    }
}