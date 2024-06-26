package com.example

import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.callloging.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    module1()
    module2()
}

fun Application.module1() {
    install(CallLogging)
    configureRouting()
}

fun Application.module2() {
    configureRouting2()
}