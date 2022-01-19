package org.mock.library

import io.micronaut.context.annotation.EachProperty

@EachProperty(Test.PREFIX)
class Test() {

    private var url: String? = null
    fun setUrl(url: String?) {
        this.url = url
    }
    fun getUrl(): String? {
        return url
    }
    companion object {
        const val PREFIX = ".auth-servers"
    }
}