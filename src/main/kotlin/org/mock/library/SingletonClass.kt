package org.mock.library

import javax.inject.Singleton

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
