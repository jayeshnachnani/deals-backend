package com.finance.deals

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class DealsApplication

fun main(args: Array<String>) {
	runApplication<DealsApplication>(*args)
}
