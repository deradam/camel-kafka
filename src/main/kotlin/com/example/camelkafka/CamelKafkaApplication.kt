package com.example.camelkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CamelKafkaApplication

fun main(args: Array<String>) {
    runApplication<CamelKafkaApplication>(*args)
}
