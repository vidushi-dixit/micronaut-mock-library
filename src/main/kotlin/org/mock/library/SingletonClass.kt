package org.mock.library

import javax.inject.Singleton

/**
 * A bean of this class is created for each micronaut.test in application.yml.
 */
@Singleton
class SingletonClass() {
    private var url: String? = null
    fun setUrl(url: String?) {
        this.url = url
    }

    fun getUrl(): String? {
        return url
    }
}
