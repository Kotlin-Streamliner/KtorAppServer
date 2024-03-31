package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
}

fun Application.configureRouting2() {
    routing {
        get("/books") {
            call.respondText("Hello Books!")
        }
    }
}
