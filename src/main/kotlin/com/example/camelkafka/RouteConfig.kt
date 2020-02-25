package com.example.camelkafka

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class RouteConfig : RouteBuilder() {

    override fun configure() {
        from("file:/Users/adamgiemza/camel_test")
                .to("kafka:files")
    }

}
