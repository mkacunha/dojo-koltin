package com.db1group.dojo

import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {

    @Test
    fun sayHelloWorld_shouldReturnHelloWorld() {
        val hello = Hello()
        assertEquals("Hello, World", hello.sayHelloWorld())
    }
}
