package com.fst.core

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import kotlinx.serialization.json.Json

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        val jsonConfig = Json {
            prettyPrint = true
        }

        json(jsonConfig)
    }
}
