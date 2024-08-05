package com.fst

import com.fst.core.configureDatabases
import com.fst.core.configureRouting
import com.fst.core.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main() = EngineMain.main(arrayOf())

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureRouting()
}
