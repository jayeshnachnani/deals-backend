package com.finance.deals

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry




@SpringBootApplication
@EnableAutoConfiguration
//@EnableAutoConfiguration(exclude = arrayOf(HypermediaAutoConfiguration::class))
class DealsApplication {

	}

fun main(args: Array<String>) {
	runApplication<DealsApplication>(*args)
}



